package com.fretes.azchip.v1.dominio.ports.repositories;

import java.util.List;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.Frete;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;

public interface FreteRepositoryPort {
    
    List<Frete> buscarTodosPorStatus( StatusFrete status);

    Frete buscarPorUuid( UUID uuid);

    Frete salvarEAtualizar(Frete frete);

    void remover( Frete frete);
}
