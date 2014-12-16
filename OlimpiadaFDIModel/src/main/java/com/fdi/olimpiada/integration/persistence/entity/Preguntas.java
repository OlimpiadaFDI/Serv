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
@Table(name = "PREGUNTAS")
public class Preguntas implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer idPregunta;
	private String pregunta;
	private Integer respuestaCorrecta;
	private Integer tipo;

	// Constructors

	/** default constructor */
	public Preguntas() {
	}

	/** full constructor */
	public Preguntas(Integer idPregunta,String pregunta, Integer respuestaCorrecta, Integer tipo) {
		this.idPregunta = idPregunta;
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.tipo = tipo;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_PREGUNTA", unique = true, nullable = false)
	public Integer getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}
	
	@Column(name = "PREGUNTA", nullable = false)
	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	@Column(name = "RESPUESTA_CORRECTA", nullable = false)
	public Integer getRespuestaCorrecta() {
		return this.respuestaCorrecta;
	}

	public void setRespuestaCorrecta(Integer respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	@Column(name = "TIPO", nullable = false)
	public Integer getTipo() {
		return this.tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

}