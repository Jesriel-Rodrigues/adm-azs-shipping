package com.fretes.azchip.v1.dominio.ports.repositories;

import java.util.List;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.model.Frete;

public interface FreteRepositoryPort {
    
    List<Frete> buscarTodosPorStatus( StatusFrete status);

    Frete buscarPorUuid( UUID uuid);

    Frete cadastrarFrete(Frete frete);

    void remover( Frete frete);
}
