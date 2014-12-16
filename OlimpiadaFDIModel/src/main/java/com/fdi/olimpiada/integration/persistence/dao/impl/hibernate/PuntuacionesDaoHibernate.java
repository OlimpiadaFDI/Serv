package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IPuntuacionesDAO;
import com.fdi.olimpiada.integration.persistence.entity.Puntuaciones;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("puntuacionesDao")
public class PuntuacionesDaoHibernate extends _OlimpiadaFDIGenericDaoHibernate<Puntuaciones, String> implements IPuntuacionesDAO {

	public PuntuacionesDaoHibernate() {
		super(Puntuaciones.class);
	}

	
}
