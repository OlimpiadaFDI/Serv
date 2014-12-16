package com.fdi.olimpiada.integration.persistence.facade.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fdi.olimpiada.integration.persistence.dao.iface.IGruposDAO;
import com.fdi.olimpiada.integration.persistence.dao.iface.IGruposUsuariosDAO;
import com.fdi.olimpiada.integration.persistence.dao.iface.IInsigniasDAO;
import com.fdi.olimpiada.integration.persistence.dao.iface.IUsuarioHasInsigniaDAO;
import com.fdi.olimpiada.integration.persistence.dao.iface.IUsuariosDAO;
import com.fdi.olimpiada.integration.persistence.entity.Grupos;
import com.fdi.olimpiada.integration.persistence.entity.GruposUsuarios;
import com.fdi.olimpiada.integration.persistence.entity.Insignias;
import com.fdi.olimpiada.integration.persistence.entity.UsuarioHasInsignia;
import com.fdi.olimpiada.integration.persistence.entity.Usuarios;
import com.fdi.olimpiada.integration.persistence.facade.iface.IInsigniasFacade;
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

@Service(value = "insigniasFacade")
public class InsigniasFacade implements IInsigniasFacade {
	
	@Autowired
	private IInsigniasDAO insigniasDAO;
	
	@Autowired
	private IUsuariosDAO usuariosDAO;
	
	@Autowired
	private IGruposDAO gruposDAO;
	
	@Autowired
	private IUsuarioHasInsigniaDAO usuarioHasInsigniaDAO;
	
	@Autowired
	private IGruposUsuariosDAO gruposUsuariosDAO;

	
	@Transactional
	public void insertarUsuario(UsuarioFacadeRequestDTO usuario) throws Exception {
		
		Usuarios usuarioSave = new Usuarios();
		usuarioSave.setCorreo(usuario.getCorreo());
		usuarioSave.setIdUsuario(usuario.getIdUsuario());
		usuarioSave.setNombre(usuario.getNombre());
		
		usuariosDAO.save(usuarioSave);
		
	}	
	
	@Transactional
	public void insertarInsignia(InsigniaFacadeRequestDTO insignia) throws Exception {
		
		Insignias insigniaSave = new Insignias();
		insigniaSave.setDescCorta(insignia.getDescCorta());
		insigniaSave.setDescLarga(insignia.getDescLarga());
		insigniaSave.setIdInsignia(insignia.getIdInsignia());
		insigniaSave.setPuntuacion(insignia.getPuntuacion());
		
		insigniasDAO.save(insigniaSave);
		
	}
	
	@Transactional
	public void insertarGrupo(GrupoFacadeRequestDTO grupo) throws Exception {
		
		Grupos grupoSave = new Grupos();
		grupoSave.setDescripcion(grupo.getDescripcion());
		grupoSave.setIdGrupo(grupo.getIdGrupo());
		
		gruposDAO.save(grupoSave);
		
	}	
	
	@Transactional
	public void asignarInsigniaAUsuario(AsignarInsigniaFacadeRequestDTO asignarInsignia) throws Exception {
		
		UsuarioHasInsignia asignarInsigniaSave = new UsuarioHasInsignia();
		asignarInsigniaSave.setIdUsuarioHasInsignia(String.valueOf(Calendar.getInstance().getTimeInMillis()));
		asignarInsigniaSave.setIdInsignia(asignarInsignia.getIdInsignia());
		asignarInsigniaSave.setIdUsuario(asignarInsignia.getIdUsuario());
		
		usuarioHasInsigniaDAO.save(asignarInsigniaSave);
		
	}	
	
	@Transactional
	public void asignarUsuarioAGrupo(AsignarUsuarioFacadeRequestDTO asignarUsuario) throws Exception {
		
		GruposUsuarios asignarUsuarioSave = new GruposUsuarios();
		asignarUsuarioSave.setIdGruposUsuarios(String.valueOf(Calendar.getInstance().getTimeInMillis()));
		asignarUsuarioSave.setIdGrupo(asignarUsuario.getIdGrupo());
		asignarUsuarioSave.setIdUsuario(asignarUsuario.getIdUsuario());
		
		gruposUsuariosDAO.save(asignarUsuarioSave);
		
	}	
	
	@Transactional
	public List<InsigniaFacadeDTO> getInsigniasUsuario(String usuario) throws Exception {
		
		List<InsigniaFacadeDTO> insignias = new ArrayList<InsigniaFacadeDTO>();
		
		List<Insignias> aux = new ArrayList<Insignias>();
		
		//hacer la query y llamarla
		return insignias;
		
	}	

}
