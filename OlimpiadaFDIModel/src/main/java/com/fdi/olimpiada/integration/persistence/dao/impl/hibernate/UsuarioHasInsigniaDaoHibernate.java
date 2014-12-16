package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IUsuarioHasInsigniaDAO;
import com.fdi.olimpiada.integration.persistence.entity.UsuarioHasInsignia;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("usuarioHasInsigniaDao")
public class UsuarioHasInsigniaDaoHibernate extends _InsigniasFDIGenericDaoHibernate<UsuarioHasInsignia, String> implements IUsuarioHasInsigniaDAO {

	public UsuarioHasInsigniaDaoHibernate() {
		super(UsuarioHasInsignia.class);
	}

	
}
