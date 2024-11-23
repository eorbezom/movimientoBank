package com.pe.certus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.certus.entity.Cliente;

//REPOSITORYO PARA ACCESO A DOTOS DE LA TABLA CLIENTE
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}
