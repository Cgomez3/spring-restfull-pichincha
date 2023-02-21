package com.banco.pichincha.app.models.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.pichincha.app.models.entity.TipoCambio;


public interface ITipoCambioDao extends JpaRepository<TipoCambio, Long>{
	
	public TipoCambio findFirstByCodigoAndFecha(String codigo,String fecha);

}
