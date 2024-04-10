package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.model.Cubagem;

public interface CubagemRepositoryPort {
    
    Cubagem cadastrarCubagem(Cubagem cubagemDto);
}
