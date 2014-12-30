package com.fdi.olimpiada.integration.persistence.facade.iface.dto;



/**
 * 
 * @author agonzalez
 *
 */

public class AsignarUsuarioFacadeRequestDTO {
	
	
	private Long idUsuario;
	private Integer idGrupo;


	public AsignarUsuarioFacadeRequestDTO(){
		super();
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdGrupo() {
		return idGrupo;
	}
	
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsignarInsigniaFacadeRequestDTO [");
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
