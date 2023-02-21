package com.banco.pichincha.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		solicitud.setImporteTipoCambio(solicitud.getImporteSolicitado() / solicitud.getTipoCambio());
		return solicitudService.save(solicitud);
	};
	
	@GetMapping("/listar")
	public Flux<Solicitud> listar(){
		return solicitudService.listarSolicitud();
	}
	
	@PutMapping
	public Mono<Solicitud> UpdateSolicitud(@RequestBody Solicitud solicitud){
		solicitud.setImporteTipoCambio(solicitud.getImporteSolicitado() / solicitud.getTipoCambio());
		return solicitudService.update(solicitud);
	}
	
	@GetMapping("/ver/{id}")
	public Mono<Solicitud> ver(@PathVariable Long id){
		return solicitudService.buscarSolicitud(id);
	}
	
	

}
