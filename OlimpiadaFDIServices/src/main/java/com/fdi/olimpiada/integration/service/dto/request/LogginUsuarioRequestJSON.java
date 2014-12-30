package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class LogginUsuarioRequestJSON {
	

	
	private String nombre;
	private String pass;

	
	public LogginUsuarioRequestJSON(){
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@FormParam("nombre")
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		builder.append("LogginUsuarioRequestJSON [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
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
