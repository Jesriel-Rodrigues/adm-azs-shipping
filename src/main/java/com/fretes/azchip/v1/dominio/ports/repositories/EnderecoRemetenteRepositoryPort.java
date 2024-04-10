package com.fretes.azchip.v1.dominio.ports.repositories;

import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;

public interface EnderecoRemetenteRepositoryPort {
    
    EnderecoRemetente cadastrarEnderecoRemetente(EnderecoRemetente enderecoDto);
}
