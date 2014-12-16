package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class GrupoRequestJSON {
	
	
	private Integer idGrupo;
	private String descripcion;

	public GrupoRequestJSON(){
		super();
	}
	
	public Integer getIdGrupo() {
		return idGrupo;
	}
	
	@FormParam("idGrupo")
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	@FormParam("descripcion")
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GrupoRequestJSON [");
		if (idGrupo != null) {
			builder.append("idGrupo=");
			builder.append(idGrupo);
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
