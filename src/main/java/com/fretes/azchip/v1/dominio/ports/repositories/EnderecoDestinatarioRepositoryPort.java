package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.dtos.EnderecoDto;
import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;

public interface EnderecoDestinatarioRepositoryPort {
    
    EnderecoDestinatario cadastrarEnderecoDestinatario(EnderecoDestinatario enderecoDto);

    EnderecoDestinatario atualizarEnderecoDestinatario(EnderecoDestinatario enderecoPut);
    
    void remover( EnderecoDto enderecoDto);
}
