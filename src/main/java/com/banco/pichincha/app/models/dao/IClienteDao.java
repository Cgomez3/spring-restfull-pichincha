package com.banco.pichincha.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banco.pichincha.app.models.entity.Cliente;


public interface IClienteDao extends JpaRepository<Cliente,Long>{
	
	@Query(value =  "select c from Cliente c where c.dni=?1")
	public Cliente findFirstByDni(String dni);
}
