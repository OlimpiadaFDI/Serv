package com.fdi.olimpiada.integration.persistence.facade.iface.dto;


/**
 * 
 * @author agonzalez
 *
 */

public class LogginUsuarioFacadeRequestDTO {
	
	
	private String nombre;
	private String pass;

	
	public LogginUsuarioFacadeRequestDTO(){
		super();
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogginUsuarioFacadeRequestDTO [");
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
