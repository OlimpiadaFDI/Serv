package com.fdi.olimpiada.integration.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fdi.olimpiada.commons.persistence.SpringContextLoader;
import com.fdi.olimpiada.integration.persistence.facade.iface.IPuntuacionesFacade;
import com.fdi.olimpiada.integration.service.dto.request.PuntuacionesRequestJSON;
import com.fdi.olimpiada.integration.service.dto.response.ServiceResponse;

/**
 * 
 * @author agonzalez
 *
 */

@Path("/puntuaciones")
public class PuntuacionesRestService {

	private IPuntuacionesFacade puntuacionesFacade = SpringContextLoader.getBeanInstance("puntuacionesFacade");
	private static final Logger LOGGER = LoggerFactory.getLogger(PuntuacionesRestService.class);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response PruebaJSON(PuntuacionesRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {

			s.setResult(request.getUser());
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@POST
	@Path("/guardar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response GuardarPuntuacion(PuntuacionesRequestJSON request) {

		ServiceResponse<String> s = new ServiceResponse<String>();

		try {
			
			puntuacionesFacade.guardarPuntuacion(request.getUser(),request.getPuntuacion());
			s.setResult(request.getUser());
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}

}
