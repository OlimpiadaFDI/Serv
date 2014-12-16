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
@Table(name = "GRUPOS")
public class Grupos implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer idGrupo;
	private String descripcion;

	

	// Constructors

	/** default constructor */
	public Grupos() {
	}

	/** full constructor */
	public Grupos(Integer idGrupo,String descripcion) {
		this.idGrupo = idGrupo;
		this.descripcion = descripcion;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_GRUPO", unique = true, nullable = false)
	public Integer getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	@Column(name = "DESCRIPCION", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}