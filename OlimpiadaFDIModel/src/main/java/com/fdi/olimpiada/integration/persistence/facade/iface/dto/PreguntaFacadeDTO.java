package com.fdi.olimpiada.integration.persistence.facade.iface.dto;

public class PreguntaFacadeDTO {
	
	private Integer idPregunta;
	private String pregunta;
	private Integer respuestaCorrecta;
	private Integer tipo;
	
	public Integer getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public Integer getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(Integer respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PreguntaFacadeDTO [idPregunta=");
		builder.append(idPregunta);
		builder.append(", ");
		if (pregunta != null) {
			builder.append("pregunta=");
			builder.append(pregunta);
			builder.append(", ");
		}
		if (respuestaCorrecta != null) {
			builder.append("respuestaCorrecta=");
			builder.append(respuestaCorrecta);
			builder.append(", ");
		}
		if (tipo != null) {
			builder.append("tipo=");
			builder.append(tipo);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
