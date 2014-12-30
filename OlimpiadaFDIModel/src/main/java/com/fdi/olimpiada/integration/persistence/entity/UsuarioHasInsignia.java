package com.fdi.olimpiada.integration.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fdi.olimpiada.commons.persistence.DomainObject;

/**
 * 
 * @author agonzalez
 *
 */

@Entity
@Table(name = "USUARIO_HAS_INSIGNIA")
public class UsuarioHasInsignia implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String idUsuarioHasInsignia;
	private Long idUsuario;
	private Integer idInsignia;
	

	

	// Constructors

	/** default constructor */
	public UsuarioHasInsignia() {
	}

	/** full constructor */
	public UsuarioHasInsignia(String idUsuarioHasInsignia,Long idUsuario,Integer idInsignia) {
		this.idUsuarioHasInsignia = idUsuarioHasInsignia;
		this.idUsuario = idUsuario;
		this.idInsignia = idInsignia;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_USUARIO_HAS_INSIGNIA", unique = true, nullable = false)
	public String getIdUsuarioHasInsignia() {
		return this.idUsuarioHasInsignia;
	}

	public void setIdUsuarioHasInsignia(String idUsuarioHasInsignia) {
		this.idUsuarioHasInsignia = idUsuarioHasInsignia;
	}
	
	@Column(name = "INSIGNIAS_ID_INSIGNIA", nullable = false)
	public Integer getIdInsignia() {
		return this.idInsignia;
	}

	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}
	
	@Column(name = "USUARIOS_ID_USUARIO", nullable = false)
	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

}