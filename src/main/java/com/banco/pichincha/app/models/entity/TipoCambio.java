package com.banco.pichincha.app.models.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="tipocambios")
public class TipoCambio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	private String moneda;
	private Double compra;
	private Double venta;	
	
	private String fecha;
	


	public TipoCambio() {
		// TODO Auto-generated constructor stub
	}

	public TipoCambio(String codigo, String moneda, Double compra, Double venta, String fecha) {
		this.codigo = codigo;
		this.moneda = moneda;
		this.compra = compra;
		this.venta = venta;
		this.fecha=fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getCompra() {
		return compra;
	}

	public void setCompra(Double compra) {
		this.compra = compra;
	}

	public Double getVenta() {
		return venta;
	}

	public void setVenta(Double venta) {
		this.venta = venta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

}
