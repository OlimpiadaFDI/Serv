package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class UsuarioRequestJSON {
	
	
	private String nombre;
	private String correo;
	private String pass;


	
	public UsuarioRequestJSON(){
		super();
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
	
	public String getPass() {
		return pass;
	}

	@FormParam("pass")
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioRequestJSON [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (correo != null) {
			builder.append("correo=");
			builder.append(correo);
			builder.append(", ");
		}
		if (pass != null) {
			builder.append("pass=");
			builder.append(pass);
		}
		builder.append("]");
		return builder.toString();
	}

}
