package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class AsignarInsigniaRequestJSON {
	
	
	private Integer idUsuario;
	private Integer idInsignia;

	public AsignarInsigniaRequestJSON(){
		super();
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	@FormParam("idUsuario")
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
		if (idUsuario != null) {
			builder.append("idUsuario=");
			builder.append(idUsuario);
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
