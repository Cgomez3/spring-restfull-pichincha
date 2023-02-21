package com.banco.pichincha.app.models.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.pichincha.app.models.dao.ITipoCambioDao;
import com.banco.pichincha.app.models.entity.TipoCambio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TipoCambioServiceImp implements ITipoCambioService{

	@Autowired
	private ITipoCambioDao tipoCambioDao;
	
	@Override
	public Flux<TipoCambio> listarTipoCambio() {
		// TODO Auto-generated method stub
		Flux<TipoCambio> listaTipoCambio= Flux.fromStream(tipoCambioDao.findAll().stream()).map(tc ->{
			tc.setCodigo(tc.getCodigo().toUpperCase());
			tc.setMoneda(tc.getMoneda().toUpperCase());
			return tc;
		}).delayElements(Duration.ofSeconds(2));
		return listaTipoCambio;
	}

	@Override
	public Mono<TipoCambio> buscarTipoCambio(String codigo,String fecha) {
		// TODO Auto-generated method stub
		return Mono.just( tipoCambioDao.findFirstByCodigoAndFecha(codigo,fecha));
	}

	@Override
	public Mono<TipoCambio> guardarTipoCambio(TipoCambio tipoCambio) {
		// TODO Auto-generated method stub
		return Mono.just(tipoCambioDao.save(tipoCambio));
	}

	@Override
	public Mono<TipoCambio> buscarTipoPorId(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(tipoCambioDao.findById(id).orElse(null));
	}

}
