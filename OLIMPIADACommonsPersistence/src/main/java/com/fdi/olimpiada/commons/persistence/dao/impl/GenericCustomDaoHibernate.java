package com.fdi.olimpiada.commons.persistence.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.fdi.olimpiada.commons.persistence.DomainObject;
import com.fdi.olimpiada.commons.persistence.types.Filter;
import com.fdi.olimpiada.commons.persistence.types.OrderType;

/**
 * 
 * @author agonzalez
 *
 */

public class GenericCustomDaoHibernate<T extends DomainObject, S extends Serializable> extends GenericDaoHibernate<T, S> {

	public GenericCustomDaoHibernate(Class<T> type) {
        super(type);
    }
	
	public <V> V findByPropertyList(List<Filter> conditionProperties){
		return findByPropertyListCriteria(conditionProperties, false, null, null, null, null);
	}
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled){
		return findByPropertyListCriteria(conditionProperties, countEnabled, null, null, null, null);
	}
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros){
		return findByPropertyListCriteria(conditionProperties, countEnabled, registroInicio, numeroRegistros, null, null);
	}
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, String orderBy) {
		return findByPropertyListCriteria(conditionProperties, false, null, null, orderBy, null);
	}
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, String orderBy, OrderType orderByType) {
		return findByPropertyListCriteria(conditionProperties, false, null, null, orderBy, orderByType);
	}
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros, String orderBy){
		return findByPropertyListCriteria(conditionProperties, countEnabled, registroInicio, numeroRegistros, orderBy, null);
	}

	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros, String orderBy, OrderType orderByType) {
		return findByPropertyListCriteria(conditionProperties, countEnabled, registroInicio, numeroRegistros, orderBy, orderByType);
	}
	
	@SuppressWarnings("unchecked")
	private <V> V findByPropertyListCriteria(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros, String orderByProperty, OrderType orderByType){
		try{
			V result = null;
			
			Criteria criteria = sessionFactory.getCurrentSession().createCriteria(type).setCacheMode(CacheMode.PUT);
			if (countEnabled){
				criteria.setProjection(Projections.rowCount());
			}else{
				if (registroInicio != null && numeroRegistros != null){
					criteria.setFirstResult(registroInicio - 1);
					criteria.setMaxResults(numeroRegistros);
				}
			}
			if (orderByProperty != null && !orderByProperty.trim().isEmpty()){
				Order order = Order.asc(orderByProperty);
				if (orderByType != null && orderByType.equals(OrderType.DESC)) {
					order = Order.desc(orderByProperty);
				}
				criteria.addOrder(order);
			}
			
			if (conditionProperties != null){
				int aCounter = 0;
				for (Filter entry : conditionProperties){
					if (entry != null && entry.getId() != null && entry.getValue() != null){
						String propId = String.valueOf(entry.getId());
						
						String[] propIdSplit = propId.split("\\.");
						
						if (!propId.startsWith("id.") && propIdSplit.length > 1){
							String aliasId = "a"+aCounter++;
							criteria.createAlias(propIdSplit[0], aliasId);
							propId = aliasId+"."+propIdSplit[1];
						}
						
						Criterion restriction = Restrictions.eq(propId, entry.getValue());
						if (entry.getOperator() != null){
							switch (entry.getOperator()) {
								case EQ:
									restriction = Restrictions.eq(propId, entry.getValue());
									break;
								case NE:
									restriction = Restrictions.ne(propId, entry.getValue());
									break;
								case NU:
									restriction = Restrictions.isNull(propId);
									break;	
								case GE:
									restriction = Restrictions.ge(propId, entry.getValue());
									break;
								case LE:
									restriction = Restrictions.le(propId, entry.getValue());
									break;
								case LK:
									restriction = Restrictions.ilike(propId, (String) entry.getValue(), MatchMode.ANYWHERE);
									break;
								case IN:
									restriction = Restrictions.in(propId, (Object[]) entry.getValue());
									break;
								case NIN:
									restriction = Restrictions.not(Restrictions.in(propId, (Object[]) entry.getValue()));
									break;	
								default:
									restriction = Restrictions.eq(propId, entry.getValue());
									break;
							}
						}
						criteria.add(restriction);
					}
				}
				
				if (countEnabled){
					result = (V) criteria.uniqueResult();
				}else{
					result = (V) criteria.list();
				}
				
			}
			
			return result;
		} catch (RuntimeException re) {
			//FIXME: Agregar logger
			throw re;
		}
		
	}
	
}
