package com.fdi.olimpiada.integration.persistence.facade.iface.dto;

import java.util.List;


public class PreguntaConRespuestasFacadeDTO {
	
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
		builder.append("PreguntaConRespuestaFacadeDTO [pregunta=");
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
