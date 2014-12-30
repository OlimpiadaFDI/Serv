package com.fdi.olimpiada.integration.persistence.dao.iface;

import java.util.List;

import com.fdi.olimpiada.commons.persistence.dao.iface.IGenericCustomDAO;
import com.fdi.olimpiada.integration.persistence.entity.Insignias;
import com.fdi.olimpiada.integration.persistence.entity.UsuarioHasInsignia;

/**
 * 
 * @author agonzalez
 *
 */

public interface IUsuarioHasInsigniaDAO extends IGenericCustomDAO<UsuarioHasInsignia, String> {
	
	public List<Insignias> getInsigniasDeUsuarioDAO(Long usuario) throws Exception;
}
