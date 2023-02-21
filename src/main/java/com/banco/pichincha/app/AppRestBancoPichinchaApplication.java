package com.banco.pichincha.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banco.pichincha.app.models.entity.Cliente;
import com.banco.pichincha.app.models.entity.TipoCambio;
import com.banco.pichincha.app.models.service.IClienteService;
import com.banco.pichincha.app.models.service.ITipoCambioService;

@SpringBootApplication
public class AppRestBancoPichinchaApplication implements CommandLineRunner{
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private ITipoCambioService tipoCambioService;

	public static void main(String[] args) {
		SpringApplication.run(AppRestBancoPichinchaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clienteService.insertarCliente(new Cliente("43506180","cristhian gomez"));
		clienteService.insertarCliente(new Cliente("56454323","Jose Robles"));
		clienteService.insertarCliente(new Cliente("54345687","Marco Flores"));
		clienteService.insertarCliente(new Cliente("54345642","Cristhian Prado"));
		
		tipoCambioService.guardarTipoCambio(new TipoCambio("PEN", "SOLES", 1.0, 1.0, "21-02-2023"));
		tipoCambioService.guardarTipoCambio(new TipoCambio("DOL", "DOLARES", 3.950, 3.854, "21-02-2023"));
		tipoCambioService.guardarTipoCambio(new TipoCambio("EUR", "EUROS", 5.950, 5.854, "21-02-2023"));
		
	}

}
