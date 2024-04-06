package com.fretes.azchip.dominio.ports.interfaces;

import java.util.List;

import com.fretes.azchip.dominio.dtos.FreteDto;

public interface FreteServicePort {
    
    List<FreteDto> buscarTodosPorStatus( String status);

    FreteDto salvarEAtualizar(FreteDto freteDto);

    void remover( FreteDto freteDto);
}
