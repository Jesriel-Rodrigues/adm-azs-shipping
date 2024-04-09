package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.dtos.CubagemDto;
import com.fretes.azchip.v1.dominio.dtos.put.CubagemPutRequest;
import com.fretes.azchip.v1.dominio.model.Cubagem;

public interface CubagemRepositoryPort {
    
    Cubagem cadastrarCubagem(Cubagem cubagemDto);

    Cubagem atualizarCubagem(Cubagem cubagemPut);
    
    void remover( CubagemDto freteDto);
}
