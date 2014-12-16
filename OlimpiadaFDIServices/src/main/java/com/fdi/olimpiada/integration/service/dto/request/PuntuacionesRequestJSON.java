package com.fdi.olimpiada.integration.service.dto.request;

import javax.ws.rs.FormParam;

/**
 * 
 * @author agonzalez
 *
 */

public class PuntuacionesRequestJSON {
	
//	@NotEmpty
//	@Size(min = 1, max = 100)
//	private String titulo;
	
	private String user;
	private String date;
	private String puntuacion;
	private String juego;

//	private byte[] adjunto1;
//	private String nomAdjunto1;
//	private byte[] adjunto2;
//	private String nomAdjunto2;
//	private byte[] adjunto3;
//	private String nomAdjunto3;
	
	public PuntuacionesRequestJSON(){
		super();
	}
	
	public String getUser() {
		return user;
	}
	
	@FormParam("user")
	public void setUser(String user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}
	
	@FormParam("puntuacion")
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPuntuacion() {
		return puntuacion;
	}

	@FormParam("puntuacion")
	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getJuego() {
		return juego;
	}
	
	@FormParam("juego")
	public void setJuego(String juego) {
		this.juego = juego;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PuntuacionesRequestJSON [");
		if (user != null) {
			builder.append("user=");
			builder.append(user);
			builder.append(", ");
		}
		if (date != null) {
			builder.append("date=");
			builder.append(date);
			builder.append(", ");
		}
		if (puntuacion != null) {
			builder.append("puntuacion=");
			builder.append(puntuacion);
			builder.append(", ");
		}
		if (juego != null) {
			builder.append("juego=");
			builder.append(juego);
		}
		builder.append("]");
		return builder.toString();
	}

}
