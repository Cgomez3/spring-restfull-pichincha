package com.banco.pichincha.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.pichincha.app.models.entity.Solicitud;

public interface ISolicitudDao extends JpaRepository<Solicitud, Long>{

}
