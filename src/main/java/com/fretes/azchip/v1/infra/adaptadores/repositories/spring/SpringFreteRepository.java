package com.fretes.azchip.v1.infra.adaptadores.repositories.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.fretes.azchip.v1.infra.adaptadores.entities.FreteEntity;

import java.util.UUID;
import java.util.List;


public interface SpringFreteRepository extends JpaRepository<FreteEntity, UUID>, JpaSpecificationExecutor<FreteEntity>{
    
    @Query(value = "SELECT f.* FROM frete f "+
        "LEFT JOIN endereco_remetente er ON f.endereco_remetente_id = er.id "+
        "LEFT JOIN endereco_destinatario ed ON f.endereco_destinatario_id = ed.id "+
        "WHERE f.nome_pacote LIKE ?1 " +
        "OR er.nome_rua LIKE ?1 " +
        "OR ed.nome_rua LIKE ?1 ", nativeQuery = true)
    List<FreteEntity> buscarTodosPorParametro(String parametro);
}
