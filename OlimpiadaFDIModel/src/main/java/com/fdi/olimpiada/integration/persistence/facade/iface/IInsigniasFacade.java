package com.fdi.olimpiada.integration.persistence.facade.iface;

import java.util.List;

import com.fdi.olimpiada.integration.persistence.facade.iface.dto.AsignarInsigniaFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.AsignarUsuarioFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.GrupoFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.InsigniaFacadeDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.InsigniaFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.UsuarioFacadeRequestDTO;

/**
 * 
 * @author agonzalez
 *
 */

public interface IInsigniasFacade {
	
	public void insertarUsuario(UsuarioFacadeRequestDTO usuario) throws Exception;
	
	public void insertarInsignia(InsigniaFacadeRequestDTO insignia) throws Exception;
	
	public void insertarGrupo(GrupoFacadeRequestDTO grupo) throws Exception;
	
	public void asignarInsigniaAUsuario(AsignarInsigniaFacadeRequestDTO asignarInsignia) throws Exception;
	
	public void asignarUsuarioAGrupo(AsignarUsuarioFacadeRequestDTO asignarUsuario) throws Exception;
	
	public List<InsigniaFacadeDTO> getInsigniasUsuario(String Usuario)throws Exception;

		
}
