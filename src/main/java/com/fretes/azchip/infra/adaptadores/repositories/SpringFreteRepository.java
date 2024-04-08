package com.fretes.azchip.infra.adaptadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

import com.fretes.azchip.infra.adaptadores.entities.FreteEntity;
import java.util.List;


public interface SpringFreteRepository extends JpaRepository<FreteEntity, UUID>{
    
    @Query(value = "select * from frete " + 
                    "where status = ?1", nativeQuery = true)
    List<FreteEntity> buscarTodosPorStatus(String status);
}
