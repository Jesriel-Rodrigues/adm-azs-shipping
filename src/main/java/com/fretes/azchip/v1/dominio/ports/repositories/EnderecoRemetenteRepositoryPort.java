package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.dtos.EnderecoDto;
import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;

public interface EnderecoRemetenteRepositoryPort {
    
    EnderecoRemetente cadastrarEnderecoRemetente(EnderecoRemetente enderecoDto);

    EnderecoRemetente atualizarEnderecoRemetente(EnderecoRemetente enderecoPut);
    
    void remover( EnderecoDto enderecoDto);
}
