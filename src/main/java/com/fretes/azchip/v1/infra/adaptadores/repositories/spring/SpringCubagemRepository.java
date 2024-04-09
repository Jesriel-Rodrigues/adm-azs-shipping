package com.fretes.azchip.v1.infra.adaptadores.repositories.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fretes.azchip.v1.infra.adaptadores.entities.CubagemEntity;

public interface SpringCubagemRepository extends JpaRepository<CubagemEntity, Long>{
    
}
