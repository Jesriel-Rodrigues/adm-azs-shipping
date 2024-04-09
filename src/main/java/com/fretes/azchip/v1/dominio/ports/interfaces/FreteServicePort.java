package com.fretes.azchip.v1.dominio.ports.interfaces;

import java.util.List;

import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;

public interface FreteServicePort {
    
    List<FreteDto> buscarTodosPorStatus( StatusFrete status);

    FreteDto cadastrarFrete(FreteDto freteDto);

    FretePutRequest atualizarFrete(FretePutRequest fretePut);
    
    void remover( FreteDto freteDto);
}
