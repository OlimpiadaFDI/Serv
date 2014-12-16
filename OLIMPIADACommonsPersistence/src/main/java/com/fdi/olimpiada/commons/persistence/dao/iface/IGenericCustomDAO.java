package com.fdi.olimpiada.commons.persistence.dao.iface;

import java.io.Serializable;
import java.util.List;

import com.fdi.olimpiada.commons.persistence.DomainObject;
import com.fdi.olimpiada.commons.persistence.types.Filter;
import com.fdi.olimpiada.commons.persistence.types.OrderType;

/**
 * 
 * @author agonzalez
 *
 */

public interface IGenericCustomDAO<T extends DomainObject, S extends Serializable> extends IGenericDAO<T, S> {

	public <V> V findByPropertyList(List<Filter> conditionProperties);
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled);
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros);
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, String orderBy);
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, String orderBy, OrderType orderByType);
	
	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros, String orderBy);

	public <V> V findByPropertyList(List<Filter> conditionProperties, boolean countEnabled, Integer registroInicio, Integer numeroRegistros, String orderBy, OrderType orderByType);
		
}