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
@Table(name = "INSIGNIAS")
public class Insignias implements DomainObject,java.io.Serializable {

	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer idInsignia;
	private String descCorta;
	private String descLarga;
	private Integer puntuacion;
	

	// Constructors

	/** default constructor */
	public Insignias() {
	}

	/** full constructor */
	public Insignias(Integer idInsignia,String descCorta,String descLarga,Integer puntuacion) {
		this.idInsignia = idInsignia;
		this.descCorta = descCorta;
		this.descLarga = descLarga;
		this.puntuacion = puntuacion;
	
	}

	// Property accessors
	
	@Id
	@Column(name = "ID_INSIGNIA", unique = true, nullable = false)
	public Integer getIdInsignia() {
		return this.idInsignia;
	}

	public void setIdInsignia(Integer idInsignia) {
		this.idInsignia = idInsignia;
	}
	
	@Column(name = "DESC_CORTA", nullable = false)
	public String getDescCorta() {
		return this.descCorta;
	}

	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}
	
	@Column(name = "DESC_LARGA", nullable = false)
	public String getDescLarga() {
		return this.descLarga;
	}

	public void setDescLarga(String descLarga) {
		this.descLarga = descLarga;
	}
	
	@Column(name = "PUNTUACION", unique = true, nullable = false)
	public Integer getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

}