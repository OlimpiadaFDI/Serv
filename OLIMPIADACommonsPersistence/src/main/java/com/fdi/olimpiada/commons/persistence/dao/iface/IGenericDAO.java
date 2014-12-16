package com.fdi.olimpiada.commons.persistence.dao.iface;

import java.io.Serializable;
import java.util.List;

import com.fdi.olimpiada.commons.persistence.DomainObject;

/**
 * 
 * @author agonzalez
 *
 */

public interface IGenericDAO<T extends DomainObject, S extends Serializable> {

	public T findById(S id);
	public List<T> findByProperty(String propId, Object propValue);
	public List<T> findByExample(T object);
	public List<T> findAll();
	public S save(T object);
	public T merge(T object);
	public void delete(T object);
	
}