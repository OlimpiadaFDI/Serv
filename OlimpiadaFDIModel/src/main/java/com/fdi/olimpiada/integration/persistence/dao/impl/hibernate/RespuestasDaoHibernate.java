package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IRespuestasDAO;
import com.fdi.olimpiada.integration.persistence.entity.Respuestas;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("respuestasDao")
public class RespuestasDaoHibernate extends _OlimpiadaFDIGenericDaoHibernate<Respuestas, Integer> implements IRespuestasDAO {

	public RespuestasDaoHibernate() {
		super(Respuestas.class);
	}

	
}
