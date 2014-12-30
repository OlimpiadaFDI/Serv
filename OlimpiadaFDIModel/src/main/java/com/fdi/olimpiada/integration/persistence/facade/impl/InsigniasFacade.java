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
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.LogginUsuarioFacadeRequestDTO;
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
		usuarioSave.setIdUsuario(Calendar.getInstance().getTimeInMillis());
		usuarioSave.setNombre(usuario.getNombre());
		usuarioSave.setPass(usuario.getPass());
		
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
	public Long existeUsuario(String nombreUsuario) throws Exception {
		
		Long idUsuario=null;
		List<Usuarios> usuarios = usuariosDAO.findByProperty("nombre", nombreUsuario);
		if (usuarios!=null && !usuarios.isEmpty()){
			idUsuario=usuarios.get(0).getIdUsuario();
		}else{
			idUsuario=(long)0;
		}
				
		return idUsuario;
	}
	
	@Transactional
	public List<InsigniaFacadeDTO> getInsigniasDeUsuario(Long usuario) throws Exception {
		
		List<InsigniaFacadeDTO> insignias = new ArrayList<InsigniaFacadeDTO>();
		
		List<Insignias> aux = new ArrayList<Insignias>();
		
		aux = usuarioHasInsigniaDAO.getInsigniasDeUsuarioDAO(usuario);
		
		for (Insignias insigniaAux : aux){
			InsigniaFacadeDTO insignia = new InsigniaFacadeDTO();
			insignia.setDescCorta(insigniaAux.getDescCorta());
			insignia.setDescLarga(insigniaAux.getDescLarga());
			insignia.setIdInsignia(insigniaAux.getIdInsignia());
			insignia.setPuntuacion(insigniaAux.getPuntuacion());
			insignias.add(insignia);
		}	
		return insignias;
	}
	
	@Transactional
	public Integer comprobarLoggin(LogginUsuarioFacadeRequestDTO logginUsuario) throws Exception {
		
		Integer loggin=null;
		List<Usuarios> usuarios = usuariosDAO.findByProperty("nombre", logginUsuario.getNombre());
		if (usuarios!=null && !usuarios.isEmpty()){
			if (usuarios.get(0).getPass().equals(logginUsuario.getPass())){
				loggin = 0;
			}
			else{
				loggin = -1;
			}
		}else{
			loggin= -2;
		}
				
		return loggin;
	}

}
