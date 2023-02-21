package com.banco.pichincha.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.pichincha.app.models.entity.TipoCambio;
import com.banco.pichincha.app.models.service.ITipoCambioService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/tipoCambio")
public class TipoCambioController {

	@Autowired
	private ITipoCambioService tipoCambioService;
	
	@GetMapping("/{codigo}/{fecha}")
	public Mono<TipoCambio> buscarPorFecha(@PathVariable String codigo,@PathVariable String fecha){
		return tipoCambioService.buscarTipoCambio(codigo,fecha);
	}
	
	@GetMapping("/{id}")
	public Mono<TipoCambio> buscarPorId(@PathVariable String id){
		return tipoCambioService.buscarTipoPorId(id);
	}
	
	@PostMapping
	public Mono<TipoCambio> guardar(@RequestBody TipoCambio tipoCambio){
		return tipoCambioService.guardarTipoCambio(tipoCambio);
	}
}
