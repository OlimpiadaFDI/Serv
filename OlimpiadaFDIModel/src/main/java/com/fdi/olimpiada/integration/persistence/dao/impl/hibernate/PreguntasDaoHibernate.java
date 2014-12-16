package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IPreguntasDAO;
import com.fdi.olimpiada.integration.persistence.entity.Preguntas;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("preguntasDao")
public class PreguntasDaoHibernate extends _OlimpiadaFDIGenericDaoHibernate<Preguntas, Integer> implements IPreguntasDAO {

	public PreguntasDaoHibernate() {
		super(Preguntas.class);
	}

	
}
