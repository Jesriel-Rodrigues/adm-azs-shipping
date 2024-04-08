package com.fretes.azchip.dominio.ports.repositories;

import java.util.List;
import java.util.UUID;

import com.fretes.azchip.dominio.Frete;
import com.fretes.azchip.dominio.enums.StatusFrete;

public interface FreteRepositoryPort {
    
    List<Frete> buscarTodosPorStatus( StatusFrete status);

    Frete buscarPorUuid( UUID uuid);

    Frete salvarEAtualizar(Frete frete);

    void remover( Frete frete);
}
