package com.fretes.azchip.v1.infra.adaptadores.repositories.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fretes.azchip.v1.infra.adaptadores.entities.EnderecoDestinatarioEntity;

public interface SpringEnderecoDestinatarioRepository extends JpaRepository<EnderecoDestinatarioEntity, Long>{
    
}