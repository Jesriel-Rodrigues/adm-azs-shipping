package com.fretes.azchip.v1.dominio.adaptadores;

import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.EnderecoDto;
import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoRemetenteServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoRemetenteRepositoryPort;

public class EnderecoRemetenteServiceImpl implements EnderecoRemetenteServicePort{

    private final EnderecoRemetenteRepositoryPort enderecoRemetenteRepositoryPort;

    public EnderecoRemetenteServiceImpl(EnderecoRemetenteRepositoryPort enderecoRemetenteRepositoryPort){
        this.enderecoRemetenteRepositoryPort = enderecoRemetenteRepositoryPort;
    }

    @Override
    public EnderecoRemetente cadastrarEnderecoRemetente(EnderecoDto enderecoDto) {
        EnderecoRemetente enderecoRemetente = new EnderecoRemetente(enderecoDto);

        return enderecoRemetenteRepositoryPort.cadastrarEnderecoRemetente(enderecoRemetente);
    }

    @Override
    public EnderecoRemetente atualizarEnderecoRemetente(EnderecoPutRequest enderecoPut) {
        EnderecoRemetente enderecoRemetente = new EnderecoRemetente(enderecoPut);

        return enderecoRemetenteRepositoryPort.cadastrarEnderecoRemetente(enderecoRemetente);
    }

    @Override
    public void remover(EnderecoDto enderecoDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    
}
