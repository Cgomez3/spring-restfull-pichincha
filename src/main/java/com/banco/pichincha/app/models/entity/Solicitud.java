package com.banco.pichincha.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="solicituds")
public class Solicitud implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoCambio tipoCambioOrigen;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoCambio tipoCambioDestino;
	private Double importeSolicitado;
	private Double importeTipoCambio;
	private Double tipoCambio;
	
	public Solicitud() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoCambio getTipoCambioOrigen() {
		return tipoCambioOrigen;
	}

	public void setTipoCambioOrigen(TipoCambio tipoCambioOrigen) {
		this.tipoCambioOrigen = tipoCambioOrigen;
	}

	public TipoCambio getTipoCambioDestino() {
		return tipoCambioDestino;
	}

	public void setTipoCambioDestino(TipoCambio tipoCambioDestino) {
		this.tipoCambioDestino = tipoCambioDestino;
	}

	public Double getImporteSolicitado() {
		return importeSolicitado;
	}

	public void setImporteSolicitado(Double importeSolicitado) {
		this.importeSolicitado = importeSolicitado;
	}


	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public Double getImporteTipoCambio() {
		return importeTipoCambio;
	}

	public void setImporteTipoCambio(Double importeTipoCambio) {
		this.importeTipoCambio = importeTipoCambio;
	}
	
	
}
