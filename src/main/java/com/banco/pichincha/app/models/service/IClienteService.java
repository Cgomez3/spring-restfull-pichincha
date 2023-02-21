package com.banco.pichincha.app.models.service;

import com.banco.pichincha.app.models.entity.Cliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClienteService {
	public Flux<Cliente> listaClientes();
	public Mono<Cliente> buscarClientePorDni(String dni);
	public Mono<Cliente> buscarClientePorId(Long id);
	public Mono<Cliente> insertarCliente(Cliente cliente);
}
