package com.sql.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "almacen")
@EntityListeners(AuditingEntityListener.class)
public class Almacen {

	@Id
	@GeneratedValue
	private Integer id;
	private String calle;
	private String numero;
	private String distrito;
	private int cp;

	public Almacen(String calle, String numero, String distrito, int cp) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.distrito = distrito;
		this.cp = cp;
	}

	public Almacen() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

}
