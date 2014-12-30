package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class AsignarUsuarioRequestJSON {
	
	
	private String nombreUsuario;
	private Integer idGrupo;

	public AsignarUsuarioRequestJSON(){
		super();
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	@FormParam("nombreUsuario")
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getIdGrupo() {
		return idGrupo;
	}
	
	@FormParam("idGrupo")
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
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
		if (idGrupo != null) {
			builder.append("idGrupo=");
			builder.append(idGrupo);
		}
		builder.append("]");
		return builder.toString();
	}

}
