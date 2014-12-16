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
@Table(name = "PUNTUACIONES")
public class Puntuaciones implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String user;
	

	// Constructors

	/** default constructor */
	public Puntuaciones() {
	}

	/** full constructor */
	public Puntuaciones(String user,String id) {
		this.user = user;
		this.id = id;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "USUARIO", nullable = false)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}