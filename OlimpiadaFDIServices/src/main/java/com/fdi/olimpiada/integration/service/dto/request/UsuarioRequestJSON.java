package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class UsuarioRequestJSON {
	
	
	private Integer idUsuario;
	private String nombre;
	private String correo;


	
	public UsuarioRequestJSON(){
		super();
	}
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	@FormParam("idUsuario")
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}
	
	@FormParam("nombre")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}

	@FormParam("correo")
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioRequestJSON [");
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
