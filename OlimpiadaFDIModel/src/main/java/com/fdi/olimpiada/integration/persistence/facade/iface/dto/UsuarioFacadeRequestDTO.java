package com.fdi.olimpiada.integration.persistence.facade.iface.dto;


/**
 * 
 * @author agonzalez
 *
 */

public class UsuarioFacadeRequestDTO {
	
	
	private Integer idUsuario;
	private String nombre;
	private String correo;


	
	public UsuarioFacadeRequestDTO(){
		super();
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioFacadeRequestDTO [");
		if (idUsuario != null) {
			builder.append("idUsuario=");
			builder.append(idUsuario);
			builder.append(", ");
		}
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (correo != null) {
			builder.append("correo=");
			builder.append(correo);
		}
		builder.append("]");
		return builder.toString();
	}

}
