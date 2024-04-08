package com.fretes.azchip.v1.dominio.ports.interfaces;

import java.util.List;

import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;

public interface FreteServicePort {
    
    List<FreteDto> buscarTodosPorStatus( StatusFrete status);

    FreteDto salvarEAtualizar(FreteDto freteDto);

    void remover( FreteDto freteDto);
}
