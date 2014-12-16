package com.fdi.olimpiada.integration.service.dto.response;

import java.util.List;

import com.fdi.olimpiada.integration.persistence.facade.iface.dto.InsigniaFacadeDTO;

public class UsuarioConInsigniasResponse {
	
	private String usuario;
	private List<InsigniaFacadeDTO> insignias;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<InsigniaFacadeDTO> getInsignias() {
		return insignias;
	}

	public void setInsignias(List<InsigniaFacadeDTO> insignias) {
		this.insignias = insignias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioConInsigniasResponse [usuario=");
		builder.append(usuario);
		builder.append(", ");
		if (insignias != null) {
			builder.append("insignias=");
			builder.append(insignias);
		}
		builder.append("]");
		return builder.toString();
	}
	

}
