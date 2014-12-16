package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IInsigniasDAO;
import com.fdi.olimpiada.integration.persistence.entity.Insignias;

/**
 * 
 * @author agonzalez
 *
 */

@Repository("insigniasDao")
public class InsigniasDaoHibernate extends _InsigniasFDIGenericDaoHibernate<Insignias, Integer> implements IInsigniasDAO {

	public InsigniasDaoHibernate() {
		super(Insignias.class);
	}

	
}
