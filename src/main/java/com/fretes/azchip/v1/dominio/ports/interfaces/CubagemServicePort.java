package com.fretes.azchip.v1.dominio.ports.interfaces;

import com.fretes.azchip.v1.dominio.dtos.CubagemDto;
import com.fretes.azchip.v1.dominio.dtos.put.CubagemPutRequest;
import com.fretes.azchip.v1.dominio.model.Cubagem;

public interface CubagemServicePort {
    
    Cubagem cadastrarCubagem(CubagemDto cubagemDto);

    Cubagem atualizarCubagem(CubagemPutRequest cubagemPut);
    
    void remover( CubagemDto freteDto);
}
