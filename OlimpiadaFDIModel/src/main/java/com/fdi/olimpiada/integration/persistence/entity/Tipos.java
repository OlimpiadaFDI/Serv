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
@Table(name = "TIPOS")
public class Tipos implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer idTipo;
	private String descripcion;
	

	// Constructors

	/** default constructor */
	public Tipos() {
	}

	/** full constructor */
	public Tipos(Integer idTipo,String descripcion) {
		this.idTipo = idTipo;
		this.descripcion = descripcion;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_TIPO", unique = true, nullable = false)
	public Integer getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	
	@Column(name = "DESCRIPCION", nullable = false)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}