package com.banco.pichincha.app.models.service;

import com.banco.pichincha.app.models.entity.Solicitud;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISolicitudService {
   public Mono<Solicitud> save(Solicitud solicitud);
   public Flux<Solicitud> listarSolicitud();
}
