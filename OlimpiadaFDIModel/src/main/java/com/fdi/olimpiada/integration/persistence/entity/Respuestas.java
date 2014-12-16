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
@Table(name = "RESPUESTAS")
public class Respuestas implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer idRespuesta;
	private String respuesta;
	private Integer idPregunta;

	// Constructors

	/** default constructor */
	public Respuestas() {
	}

	/** full constructor */
	public Respuestas(Integer idRespuesta,String respuesta, Integer idPregunta) {
		this.idRespuesta = idRespuesta;
		this.respuesta = respuesta;
		this.idPregunta = idPregunta;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_RESPUESTA", unique = true, nullable = false)
	public Integer getIdRespuesta() {
		return this.idRespuesta;
	}

	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}
	
	@Column(name = "RESPUESTA", nullable = false)
	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	@Column(name = "ID_PREGUNTA", nullable = false)
	public Integer getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

}