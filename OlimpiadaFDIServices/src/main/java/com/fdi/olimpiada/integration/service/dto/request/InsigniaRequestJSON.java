package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class InsigniaRequestJSON {
	
	
	private Integer idInsignia;
	private String descCorta;
	private String descLarga;
	private Integer puntuacion;


	
	public InsigniaRequestJSON(){
		super();
	}
	
	public Integer getIdInsignia() {
		return idInsignia;
	}
	
	@FormParam("idInsignia")
	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}

	public String getDescCorta() {
		return descCorta;
	}
	
	@FormParam("descCorta")
	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}
	
	public String getDescLarga() {
		return descLarga;
	}

	@FormParam("descLarga")
	public void setDescLarga(String descLarga) {
		this.descLarga = descLarga;
	}
	
	public Integer getPuntuacion() {
		return puntuacion;
	}
	
	@FormParam("puntuacion")
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InsigniaRequestJSON [");
		if (idInsignia != null) {
			builder.append("idInsignia=");
			builder.append(idInsignia);
			builder.append(", ");
		}
		if (descCorta != null) {
			builder.append("descCorta=");
			builder.append(descCorta);
			builder.append(", ");
		}
		if (descLarga != null) {
			builder.append("descLarga=");
			builder.append(descLarga);
			builder.append(", ");
		}
		if (puntuacion != null) {
			builder.append("puntuacion=");
			builder.append(puntuacion);
		}
		builder.append("]");
		return builder.toString();
	}

}
