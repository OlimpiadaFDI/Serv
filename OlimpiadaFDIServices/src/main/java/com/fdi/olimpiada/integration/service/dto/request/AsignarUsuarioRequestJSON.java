package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class AsignarUsuarioRequestJSON {
	
	
	private Integer idUsuario;
	private Integer idGrupo;

	public AsignarUsuarioRequestJSON(){
		super();
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	@FormParam("idUsuario")
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
		if (idUsuario != null) {
			builder.append("idUsuario=");
			builder.append(idUsuario);
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
