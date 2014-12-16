package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.ITiposDAO;
import com.fdi.olimpiada.integration.persistence.entity.Tipos;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("tiposDao")
public class TiposDaoHibernate extends _OlimpiadaFDIGenericDaoHibernate<Tipos, Integer> implements ITiposDAO {

	public TiposDaoHibernate() {
		super(Tipos.class);
	}

	
}
