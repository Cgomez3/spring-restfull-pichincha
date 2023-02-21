package com.banco.pichincha.app.models.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.pichincha.app.models.dao.IClienteDao;
import com.banco.pichincha.app.models.entity.Cliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImp implements IClienteService{


	@Autowired
	private IClienteDao solicitanteDao;
	
	@Override
	public Flux<Cliente> listaClientes() {
		// TODO Auto-generated method stub
		//Convertimos el nombre del cliente en Mayuscula
		Flux<Cliente> listaCliente=Flux.fromStream( solicitanteDao.findAll().stream()).map(cliente ->{
			cliente.setNombre(cliente.getNombre().toUpperCase());
			return cliente;
		}).delayElements(Duration.ofSeconds(2));
		
		return listaCliente;
	}

	@Override
	public Mono<Cliente> buscarClientePorDni(String dni) {
		return Mono.just(solicitanteDao.findFirstByDni(dni));
	}

	@Override
	public Mono<Cliente> insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return Mono.just(solicitanteDao.save(cliente));
	}

	@Override
	public Mono<Cliente> buscarClientePorId(Long id) {
		// TODO Auto-generated method stub
		return Mono.just(solicitanteDao.findById(id).orElse(null));
	}

	

}
