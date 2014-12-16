package com.fdi.olimpiada.integration.persistence.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fdi.olimpiada.integration.persistence.dao.iface.IPreguntasDAO;
import com.fdi.olimpiada.integration.persistence.dao.iface.IRespuestasDAO;
import com.fdi.olimpiada.integration.persistence.entity.Preguntas;
import com.fdi.olimpiada.integration.persistence.entity.Respuestas;
import com.fdi.olimpiada.integration.persistence.facade.iface.IQuickTestFacade;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.PreguntaConRespuestasFacadeDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.PreguntaFacadeDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.RespuestaFacadeDTO;

/**
 * 
 * @author agonzalez
 *
 */

@Service(value = "quickTestFacade")
public class QuickTestFacade implements IQuickTestFacade {
	
	@Autowired
	private IPreguntasDAO preguntasDAO;
	
	@Autowired
	private IRespuestasDAO respuestasDAO;

	
	@Transactional
	public PreguntaConRespuestasFacadeDTO getPreguntaConRespuestas() throws Exception {
		
		PreguntaConRespuestasFacadeDTO preguntaConRespuestas = new PreguntaConRespuestasFacadeDTO();
		
		//generara numeros hasta 3 sin incluirlo, como tenemos 2 preguntas ponemos un 3 ya que no lo incluye
		double num = (Math.random()*(6-1)+1);
		int id = (int)num;
		
		
		Preguntas pregunta = preguntasDAO.findById(id);
		PreguntaFacadeDTO preguntaFacade = new PreguntaFacadeDTO();
		if (pregunta!=null){
			preguntaFacade.setIdPregunta(pregunta.getIdPregunta());
			preguntaFacade.setPregunta(pregunta.getPregunta());
			preguntaFacade.setRespuestaCorrecta(pregunta.getRespuestaCorrecta());
			preguntaFacade.setTipo(pregunta.getTipo());
		}
		
		preguntaConRespuestas.setPregunta(preguntaFacade);
		
		List<Respuestas> respuestas = respuestasDAO.findByProperty("idPregunta", pregunta.getIdPregunta());
		
		List<RespuestaFacadeDTO> respuestasResponse =new ArrayList<RespuestaFacadeDTO>();
		if (respuestas != null && !respuestas.isEmpty()){
			for (Respuestas respuesta : respuestas){
				if (respuesta != null){
					RespuestaFacadeDTO respuestaFacade = new RespuestaFacadeDTO();
					respuestaFacade.setIdPregunta(respuesta.getIdPregunta());
					respuestaFacade.setIdRespuesta(respuesta.getIdRespuesta());
					respuestaFacade.setRespuesta(respuesta.getRespuesta());
					
					respuestasResponse.add(respuestaFacade);
				}
			}
		}
		
		preguntaConRespuestas.setRespuestas(respuestasResponse);
		
		return preguntaConRespuestas;
		
		
		
	}	

}
