package com.fretes.azchip.dominio.ports.repositories;

import java.util.List;

import com.fretes.azchip.dominio.Frete;

public interface FreteRepositoryPort {
    
    List<Frete> buscarTodosPorStatus( String status);

    Frete salvarEAtualizar(Frete frete);

    void remover( Frete frete);
}
