package com.fdi.olimpiada.commons.persistence.dao.impl;

import static org.hibernate.criterion.Example.create;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

import com.fdi.olimpiada.commons.persistence.DomainObject;
import com.fdi.olimpiada.commons.persistence.dao.iface.IGenericCustomDAO;

/**
 * 
 * @author agonzalez
 *
 */

public abstract class GenericDaoHibernate<T extends DomainObject, S extends Serializable> implements IGenericCustomDAO<T, S> {

	protected Class<T> type;
	protected SessionFactory sessionFactory;

	public GenericDaoHibernate(Class<T> type) {
        super();
        this.type = type;
    }
	
	@SuppressWarnings("unchecked")
	public T findById(S id) {
		return (T) sessionFactory.getCurrentSession().get(type, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByProperty(String propId, Object propValue) {
		return (List<T>) sessionFactory.getCurrentSession()
				.createQuery("from " + type.getSimpleName() + " as model where model."+ propId + " = :propValue")
				.setParameter("propValue", propValue)
				.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T object) {
		return (List<T>) sessionFactory.getCurrentSession()
				.createCriteria(type)
				.add(create(object))
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return (List<T>) sessionFactory.getCurrentSession().createCriteria(type).list();
	}

	@SuppressWarnings("unchecked")
	public S save(T object) {
		S id = (S) sessionFactory.getCurrentSession().save(object);
		sessionFactory.getCurrentSession().flush();
        return id;
	}
	
	@SuppressWarnings("unchecked")
	public T merge(T object) {
		object = (T) sessionFactory.getCurrentSession().merge(object);
		sessionFactory.getCurrentSession().flush();
        return object;
	}
	
	public void delete(T object) {
		sessionFactory.getCurrentSession().delete(object);
	}

}
