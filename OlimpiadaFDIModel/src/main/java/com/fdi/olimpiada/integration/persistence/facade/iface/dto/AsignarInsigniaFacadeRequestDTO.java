package com.fdi.olimpiada.integration.persistence.facade.iface.dto;



/**
 * 
 * @author agonzalez
 *
 */

public class AsignarInsigniaFacadeRequestDTO {
	
	
	private Long idUsuario;
	private Integer idInsignia;


	public AsignarInsigniaFacadeRequestDTO(){
		super();
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdInsignia() {
		return idInsignia;
	}
	
	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
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
		if (idInsignia != null) {
			builder.append("idInsignia=");
			builder.append(idInsignia);
		}
		builder.append("]");
		return builder.toString();
	}


}
