package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IUsuariosDAO;
import com.fdi.olimpiada.integration.persistence.entity.Usuarios;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("usuariosDao")
public class UsuariosDaoHibernate extends _InsigniasFDIGenericDaoHibernate<Usuarios, Integer> implements IUsuariosDAO {

	public UsuariosDaoHibernate() {
		super(Usuarios.class);
	}

	
}
