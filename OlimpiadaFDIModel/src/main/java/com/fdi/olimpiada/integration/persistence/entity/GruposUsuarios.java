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
@Table(name = "GRUPOS_USUARIOS")
public class GruposUsuarios implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String idGruposUsuarios;
	private Long idUsuario;
	private Integer idGrupo;
	

	

	// Constructors

	/** default constructor */
	public GruposUsuarios() {
	}

	/** full constructor */
	public GruposUsuarios(String idGruposUsuarios,Long idUsuario,Integer idGrupo) {
		this.idGruposUsuarios = idGruposUsuarios;
		this.idUsuario = idUsuario;
		this.idGrupo = idGrupo;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_GRUPOS_USUARIOS", unique = true, nullable = false)
	public String getIdGruposUsuarios() {
		return this.idGruposUsuarios;
	}

	public void setIdGruposUsuarios(String idGruposUsuarios) {
		this.idGruposUsuarios = idGruposUsuarios;
	}
	
	@Column(name = "GRUPOS_ID_GRUPO", nullable = false)
	public Integer getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	@Column(name = "USUARIOS_ID_USUARIO", nullable = false)
	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

}