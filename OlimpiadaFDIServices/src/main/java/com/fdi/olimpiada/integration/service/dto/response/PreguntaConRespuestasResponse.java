package com.fdi.olimpiada.integration.service.dto.response;

import java.util.List;

import com.fdi.olimpiada.integration.persistence.facade.iface.dto.PreguntaFacadeDTO;
import com.fdi.olimpiada.integration.persistence.facade.iface.dto.RespuestaFacadeDTO;

public class PreguntaConRespuestasResponse {
	
	private PreguntaFacadeDTO pregunta;
	private List<RespuestaFacadeDTO> respuestas;
	
	public PreguntaFacadeDTO getPregunta() {
		return pregunta;
	}

	public void setPregunta(PreguntaFacadeDTO pregunta) {
		this.pregunta = pregunta;
	}

	public List<RespuestaFacadeDTO> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<RespuestaFacadeDTO> respuestas) {
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PreguntaConRespuestaResponse [pregunta=");
		builder.append(pregunta);
		builder.append(", ");
		if (respuestas != null) {
			builder.append("respuestas=");
			builder.append(respuestas);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
