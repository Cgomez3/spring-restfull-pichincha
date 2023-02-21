package com.banco.pichincha.app.models.service;

import com.banco.pichincha.app.models.entity.TipoCambio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITipoCambioService {
	public Flux<TipoCambio> listarTipoCambio();
	public Mono<TipoCambio> buscarTipoCambio(String codigo,String fecha);
	public Mono<TipoCambio> buscarTipoPorId(String id);
	public Mono<TipoCambio> guardarTipoCambio(TipoCambio  tipoCambio);
}
