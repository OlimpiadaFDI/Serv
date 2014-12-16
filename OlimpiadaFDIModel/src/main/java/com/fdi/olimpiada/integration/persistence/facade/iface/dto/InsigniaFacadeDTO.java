package com.fdi.olimpiada.integration.persistence.facade.iface.dto;



/**
 * 
 * @author agonzalez
 *
 */

public class InsigniaFacadeDTO {
	
	
	private Integer idInsignia;
	private String descCorta;
	private String descLarga;
	private Integer puntuacion;


	
	public InsigniaFacadeDTO(){
		super();
	}
	
	public Integer getIdInsignia() {
		return idInsignia;
	}
	
	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}

	public String getDescCorta() {
		return descCorta;
	}
	
	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}
	
	public String getDescLarga() {
		return descLarga;
	}

	public void setDescLarga(String descLarga) {
		this.descLarga = descLarga;
	}
	
	public Integer getPuntuacion() {
		return puntuacion;
	}
	
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InsigniaFacadeRequestDTO [");
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
