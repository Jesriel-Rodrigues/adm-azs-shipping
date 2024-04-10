package com.fretes.azchip.v1.dominio.ports.interfaces;


import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.EnderecoDto;
import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;

public interface EnderecoDestinatarioServicePort {
    
    EnderecoDestinatario cadastrarEnderecoDestinatario(EnderecoDto enderecoDto);

    EnderecoDestinatario atualizarEnderecoDestinatario(EnderecoPutRequest enderecoPut);
    
    void remover( EnderecoDto enderecoDto);
}
