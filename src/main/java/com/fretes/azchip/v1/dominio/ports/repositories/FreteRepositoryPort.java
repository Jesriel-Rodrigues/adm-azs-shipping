package com.fretes.azchip.v1.dominio.ports.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;

import com.fretes.azchip.v1.dominio.model.Frete;

public interface FreteRepositoryPort {
    
    Page<Frete> buscarTodosPorStatus( String parametro);

    Frete buscarPorUuid( UUID uuid);

    Frete cadastrarFrete(Frete frete);

    Frete atualizarFrete(Frete frete);

    void remover( Frete frete);
}
