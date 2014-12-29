package com.fdi.olimpiada.integration.service.rest;

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
import com.fdi.olimpiada.integration.persistence.facade.iface.IQuickTestFacade;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.PreguntaConRespuestasFacadeDTO;
import com.fdi.olimpiada.integration.service.dto.request.PuntuacionesRequestJSON;
import com.fdi.olimpiada.integration.service.dto.response.PreguntaConRespuestasResponse;
import com.fdi.olimpiada.integration.service.dto.response.ServiceResponse;

/**
 * 
 * @author agonzalez
 *
 */

@Path("/quickTest")
public class QuickTestRestService {

	private IQuickTestFacade quickTestFacade = SpringContextLoader.getBeanInstance("quickTestFacade");
	private static final Logger LOGGER = LoggerFactory.getLogger(QuickTestRestService.class);

	@GET
	@Path("/preguntaAleatoria")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPreguntaAleatoria() {

		ServiceResponse<PreguntaConRespuestasResponse> s = new ServiceResponse<PreguntaConRespuestasResponse>();

		try {

			PreguntaConRespuestasFacadeDTO result = quickTestFacade.getPreguntaConRespuestas();
			PreguntaConRespuestasResponse response = new PreguntaConRespuestasResponse();
			response.setPregunta(result.getPregunta());
			response.setRespuestas(result.getRespuestas());
			
			s.setResult(response);
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
	@GET
	@Path("/preguntaPorTipo/{tipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPreguntaPorTipo(@PathParam("tipo") Integer tipo) {

		ServiceResponse<PreguntaConRespuestasResponse> s = new ServiceResponse<PreguntaConRespuestasResponse>();

		try {

			PreguntaConRespuestasFacadeDTO result = quickTestFacade.getPreguntaPorTipoConRespuestas(tipo);
			PreguntaConRespuestasResponse response = new PreguntaConRespuestasResponse();
			response.setPregunta(result.getPregunta());
			response.setRespuestas(result.getRespuestas());
			
			s.setResult(response);
			s.setCode(0);
		} catch (Exception e) {
			s.setCode(1);
			s.setMessage(e.getMessage());
		}

		return Response.ok(s).build();
	}
	
}
