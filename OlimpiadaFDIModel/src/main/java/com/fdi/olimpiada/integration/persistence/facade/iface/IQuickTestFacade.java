package com.fdi.olimpiada.integration.persistence.facade.iface;

import com.fdi.olimpiada.integration.persistence.facade.iface.dto.PreguntaConRespuestasFacadeDTO;

/**
 * 
 * @author agonzalez
 *
 */

public interface IQuickTestFacade {
	
	public PreguntaConRespuestasFacadeDTO getPreguntaConRespuestas() throws Exception;

		
}
