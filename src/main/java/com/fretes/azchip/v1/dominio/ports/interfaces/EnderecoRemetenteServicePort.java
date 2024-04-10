package com.fretes.azchip.v1.dominio.ports.interfaces;

import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.EnderecoDto;
import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;

public interface EnderecoRemetenteServicePort {
    
    EnderecoRemetente cadastrarEnderecoRemetente(EnderecoDto enderecoDto);

    EnderecoRemetente atualizarEnderecoRemetente(EnderecoPutRequest enderecoPut);
    
    void remover( EnderecoDto enderecoDto);
}
