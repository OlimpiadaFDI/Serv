package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class AsignarInsigniaRequestJSON {
	
	
	private String nombreUsuario;
	private Integer idInsignia;

	public AsignarInsigniaRequestJSON(){
		super();
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	@FormParam("nombreUsuario")
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getIdInsignia() {
		return idInsignia;
	}
	
	@FormParam("idInsignia")
	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsignarInsigniaRequestJSON [");
		if (nombreUsuario != null) {
			builder.append("nombreUsuario=");
			builder.append(nombreUsuario);
			builder.append(", ");
		}
		if (idInsignia != null) {
			builder.append("idInsignia=");
			builder.append(idInsignia);
		}
		builder.append("]");
		return builder.toString();
	}

}
