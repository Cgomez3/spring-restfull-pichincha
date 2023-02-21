package com.banco.pichincha.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.banco.pichincha.app.models.dao.ISolicitudDao;
import com.banco.pichincha.app.models.entity.Solicitud;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class SolicitudServiceImp implements ISolicitudService{
	
	@Autowired
	private ISolicitudDao solicitudDao;

	@Override
	public Mono<Solicitud> save(Solicitud solicitud) {
		// TODO Auto-generated method stub
		return Mono.just(solicitudDao.save(solicitud));
	}

	@Override
	public Flux<Solicitud> listarSolicitud() {
		// TODO Auto-generated method stub
		return Flux.fromStream(solicitudDao.findAll().stream());
	}

}
