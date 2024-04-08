package com.fretes.azchip.dominio.ports.interfaces;

import java.util.List;

import com.fretes.azchip.dominio.dtos.FreteDto;
import com.fretes.azchip.dominio.enums.StatusFrete;

public interface FreteServicePort {
    
    List<FreteDto> buscarTodosPorStatus( StatusFrete status);

    FreteDto salvarEAtualizar(FreteDto freteDto);

    void remover( FreteDto freteDto);
}
