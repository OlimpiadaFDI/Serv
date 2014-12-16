package com.fdi.olimpiada.integration.persistence.facade.iface.dto;



/**
 * 
 * @author agonzalez
 *
 */

public class GrupoFacadeRequestDTO {
	
	
	private Integer idGrupo;
	private String descripcion;


	public GrupoFacadeRequestDTO(){
		super();
	}
	
	public Integer getIdGrupo() {
		return idGrupo;
	}
	
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GrupoFacadeRequestDTO [");
		if (idGrupo != null) {
			builder.append("idGrupo=");
			builder.append(idGrupo);
			builder.append(", ");
		}
		if (descripcion != null) {
			builder.append("descripcion=");
			builder.append(descripcion);
		}
		builder.append("]");
		return builder.toString();
	}


}
