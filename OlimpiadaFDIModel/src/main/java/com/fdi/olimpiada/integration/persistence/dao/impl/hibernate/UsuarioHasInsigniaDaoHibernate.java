package com.fdi.olimpiada.integration.persistence.dao.impl.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;

import com.fdi.olimpiada.integration.persistence.dao.iface.IUsuarioHasInsigniaDAO;
import com.fdi.olimpiada.integration.persistence.entity.Insignias;
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

	@SuppressWarnings("unchecked")
	public List<Insignias> getInsigniasDeUsuarioDAO(Integer usuario) throws Exception {
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("select UhI.INSIGNIAS_ID_INSIGNIA as idInsignia, I.DESC_CORTA as descCorta, I.DESC_LARGA as descLarga, I.PUNTUACION as puntuacion");
			
			sql.append(" from  fdi.usuario_has_insignia as UhI"
							+ " left join fdi.insignias as I on (Uhi.INSIGNIAS_ID_INSIGNIA = I.ID_INSIGNIA)"
							+ "	where USUARIOS_ID_USUARIO ='"+ usuario +"'"		
							+ "	group by UhI.ID_USUARIO_HAS_INSIGNIA, I.DESC_CORTA, I.DESC_LARGA, I.PUNTUACION");
			
			SQLQuery query = super.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
			
			query
			.addScalar("idInsignia", IntegerType.INSTANCE)
			.addScalar("descCorta", StringType.INSTANCE)
			.addScalar("descLarga", StringType.INSTANCE)
			.addScalar("puntuacion", IntegerType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(Insignias.class));

		return query.list();
			

		} catch (RuntimeException re) {
			throw re;
		}
	}
}
