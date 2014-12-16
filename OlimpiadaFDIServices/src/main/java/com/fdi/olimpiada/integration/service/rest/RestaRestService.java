package com.fdi.olimpiada.integration.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fdi.olimpiada.integration.service.dto.response.ServiceResponse;

/**
 * 
 * @author agonzalez
 *
 */

@Path("/resta")
public class RestaRestService {
	
	
	@GET
	@Path("/a10/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMultiplicacionPor2(@PathParam("num") Integer num) {

		ServiceResponse<Integer> s = new ServiceResponse<Integer>();
		
		try{
			
			s.setResult(10 - num);
			
		} catch (Exception e){
			s.setCode(1);
			s.setMessage(e.getMessage());
		}
		
		
		return Response.ok(s).build();
	}
	
	
}
