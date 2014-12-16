package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.fdi.olimpiada.commons.persistence.DomainObject;
import com.fdi.olimpiada.commons.persistence.dao.impl.GenericCustomDaoHibernate;

/**
 * 
 * @author agonzalez
 *
 */

public class _OlimpiadaFDIGenericDaoHibernate<T extends DomainObject, S extends Serializable> extends GenericCustomDaoHibernate<T, S> {

	@Autowired
	@Qualifier("olimpiadaFDISessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.sessionFactory = sessionFactory;
	}
	
	public _OlimpiadaFDIGenericDaoHibernate(Class<T> type) {
		super(type);
	}

}
