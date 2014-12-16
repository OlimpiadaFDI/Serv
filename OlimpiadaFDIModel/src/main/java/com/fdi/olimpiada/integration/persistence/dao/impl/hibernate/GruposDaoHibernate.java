package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IGruposDAO;
import com.fdi.olimpiada.integration.persistence.entity.Grupos;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("gruposDao")
public class GruposDaoHibernate extends _InsigniasFDIGenericDaoHibernate<Grupos, Integer> implements IGruposDAO {

	public GruposDaoHibernate() {
		super(Grupos.class);
	}

	
}
