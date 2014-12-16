package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IGruposUsuariosDAO;
import com.fdi.olimpiada.integration.persistence.entity.GruposUsuarios;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("gruposUsuariosDao")
public class GruposUsuariosDaoHibernate extends _InsigniasFDIGenericDaoHibernate<GruposUsuarios, String> implements IGruposUsuariosDAO {

	public GruposUsuariosDaoHibernate() {
		super(GruposUsuarios.class);
	}

	
}
