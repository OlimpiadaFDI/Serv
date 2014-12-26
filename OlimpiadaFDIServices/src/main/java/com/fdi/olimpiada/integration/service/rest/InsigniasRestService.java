package com.fdi.olimpiada.integration.service.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fdi.olimpiada.commons.persistence.SpringContextLoader;
import com.fdi.olimpiada.integration.persistence.facade.iface.IInsigniasFacade;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.AsignarInsigniaFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.AsignarUsuarioFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.GrupoFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.InsigniaFacadeDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.InsigniaFacadeRequestDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.UsuarioFacadeRequestDTO;
import com.fdi.olimpiada.integration.service.dto.request.AsignarInsigniaRequestJSON;
import com.fdi.olimpiada.integration.service.dto.request.AsignarUsuarioRequestJSON;
import com.fdi.olimpiada.integration.service.dto.request.GrupoRequestJSON;
import com.fdi.olimpiada.integration.service.dto.request.InsigniaRequestJSON;
import com.fdi.olimpiada.integration.service.dto.request.UsuarioRequestJSON;
import com.fdi.olimpiada.integration.service.dto.response.ServiceResponse;
import com.fdi.olimpiada.integration.service.dto.response.UsuarioConInsigniasResponse;

/**
 * 
 * @author agonzalez
 *
 */

@Path("/insignias")
public class InsigniasRestService {

	private IInsigniasFacade insigniasFacade = SpringContextLoader.getBeanInstance("insigniasFacade");
	private static final Logger LOGGER = LoggerFactory.getLogger(InsigniasRestService.class);

	@POST
	@Path("/insertarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertarUsuario(UsuarioRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			UsuarioFacadeRequestDTO usuario = new UsuarioFacadeRequestDTO();
			usuario.setCorreo(request.getCorreo());
			usuario.setIdUsuario(request.getIdUsuario());
			usuario.setNombre(request.getNombre());
			insigniasFacade.insertarUsuario(usuario);
			
			s.setMessage("OK");
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@POST
	@Path("/insertarInsignia")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertarInsignia(InsigniaRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			InsigniaFacadeRequestDTO insignia = new InsigniaFacadeRequestDTO();
			insignia.setDescCorta(request.getDescCorta());
			insignia.setDescLarga(request.getDescLarga());
			insignia.setIdInsignia(request.getIdInsignia());
			insignia.setPuntuacion(request.getPuntuacion());
			insigniasFacade.insertarInsignia(insignia);
			
			s.setMessage("OK");
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@POST
	@Path("/insertarGrupo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertarGrupo(GrupoRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			GrupoFacadeRequestDTO grupo = new GrupoFacadeRequestDTO();
			grupo.setDescripcion(request.getDescripcion());
			grupo.setIdGrupo(request.getIdGrupo());
			
			insigniasFacade.insertarGrupo(grupo);
			
			s.setMessage("OK");
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@POST
	@Path("/asignarInsigniaAUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response asignarInsigniaAUsuario(AsignarInsigniaRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			AsignarInsigniaFacadeRequestDTO asignarInsignia = new AsignarInsigniaFacadeRequestDTO();
			
			asignarInsignia.setIdInsignia(request.getIdInsignia());
			asignarInsignia.setIdUsuario(request.getIdUsuario());
			
			insigniasFacade.asignarInsigniaAUsuario(asignarInsignia);
			
			s.setMessage("OK");
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@POST
	@Path("/asignarUsuarioAGrupo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response asignarUsuarioAGrupo(AsignarUsuarioRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			AsignarUsuarioFacadeRequestDTO asignarUsuario = new AsignarUsuarioFacadeRequestDTO();
			
			asignarUsuario.setIdGrupo(request.getIdGrupo());
			asignarUsuario.setIdUsuario(request.getIdUsuario());
			
			insigniasFacade.asignarUsuarioAGrupo(asignarUsuario);
			
			s.setMessage("OK");
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@GET
	@Path("/insigniasUsuario/{usuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInsigniasUsuario(@PathParam("usuario") String usuario) {

		ServiceResponse<UsuarioConInsigniasResponse> s = new ServiceResponse<UsuarioConInsigniasResponse>();

		try {
			UsuarioConInsigniasResponse usuarioConInsignias = new UsuarioConInsigniasResponse();
			Integer idUsuario=null;
			idUsuario= insigniasFacade.existeUsuario(usuario);
			if (idUsuario!=null && idUsuario!=0){
			
				List<InsigniaFacadeDTO> insignias = insigniasFacade.getInsigniasDeUsuario(idUsuario);
				usuarioConInsignias.setUsuario(usuario);
				usuarioConInsignias.setInsignias(insignias);
				
				s.setResult(usuarioConInsignias);			
				s.setMessage("OK");
				s.setCode(0);
			}else{
				s.setMessage("El usuario no existe");
				s.setCode(-1);
			}
		} catch (Exception e) {
			s.setCode(-1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}

	
}
