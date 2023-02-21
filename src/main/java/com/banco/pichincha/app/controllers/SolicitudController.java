package com.banco.pichincha.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.pichincha.app.models.entity.Solicitud;
import com.banco.pichincha.app.models.service.ISolicitudService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/solicitud")
public class SolicitudController {
	@Autowired
	private ISolicitudService solicitudService;
	
	@PostMapping
	public Mono<Solicitud> Save(@RequestBody Solicitud solicitud){
		//System.out.println(solicitud.get);
		solicitud.setImporteTipoCambio(solicitud.getImporteSolicitado() / solicitud.getTipoCambio());
		return solicitudService.save(solicitud);
	};
	
	@GetMapping("/listar")
	public Flux<Solicitud> listar(){
		return solicitudService.listarSolicitud();
	}
	

}
