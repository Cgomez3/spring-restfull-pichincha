package com.banco.pichincha.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.pichincha.app.models.entity.Cliente;
import com.banco.pichincha.app.models.service.IClienteService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping
	public Flux<Cliente> listarClientes(){
		return clienteService.listaClientes();
	}
	
	@GetMapping("/dni/{dni}")
	public Mono<Cliente> listarClientes(@PathVariable String dni){
		return clienteService.buscarClientePorDni(dni);
	}
	
	@GetMapping("/{id}")
	public Mono<Cliente> listarClientesPorId(@PathVariable Long id){
		return clienteService.buscarClientePorId(id);
	}
	
	@PostMapping
	public Mono<Cliente>inserttarCliente(@RequestBody Cliente cliente){
		return clienteService.insertarCliente(cliente);
	}
	
	

}
