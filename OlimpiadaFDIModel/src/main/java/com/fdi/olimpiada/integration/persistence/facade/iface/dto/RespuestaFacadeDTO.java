package com.fdi.olimpiada.integration.persistence.facade.iface.dto;

public class RespuestaFacadeDTO {
	
	private Integer idRespuesta;
	private String respuesta;
	private Integer idPregunta;
	
		
	public Integer getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespuestaFacadeDTO [idRespuesta=");
		builder.append(idRespuesta);
		builder.append(", ");
		if (respuesta != null) {
			builder.append("respuesta=");
			builder.append(respuesta);
			builder.append(", ");
		}
		if (idPregunta != null) {
			builder.append("idPregunta=");
			builder.append(idPregunta);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
