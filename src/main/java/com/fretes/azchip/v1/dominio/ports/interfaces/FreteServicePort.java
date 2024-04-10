package com.fretes.azchip.v1.dominio.ports.interfaces;


import org.springframework.data.domain.Page;

import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.response.FreteResponse;

public interface FreteServicePort {

    FreteResponse buscarPorUuidResponse(String freteUuid);
    
    Page<FreteResponse> buscarTodosPorStatus( String parametro);

    FreteResponse cadastrarFrete(FreteDto freteDto);

    FreteResponse atualizarFrete(FretePutRequest fretePut);
    
    void remover( String freteUuid);
}
