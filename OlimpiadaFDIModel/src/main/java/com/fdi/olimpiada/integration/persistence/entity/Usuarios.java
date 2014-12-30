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
@Table(name = "USUARIOS")
public class Usuarios implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Long idUsuario;
	private String nombre;
	private String correo;
	private String pass;

	

	// Constructors

	/** default constructor */
	public Usuarios() {
	}

	/** full constructor */
	public Usuarios(Long idUsuario,String nombre,String correo, String pass) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.correo = correo;
		this.pass = pass;
		
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_USUARIO", unique = true, nullable = false)
	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@Column(name = "NOMBRE", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "CORREO", nullable = false)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Column(name = "PASS", nullable = false)
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


}