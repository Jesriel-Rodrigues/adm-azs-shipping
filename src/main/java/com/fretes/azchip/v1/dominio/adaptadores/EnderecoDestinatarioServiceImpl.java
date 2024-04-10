package com.fretes.azchip.v1.dominio.adaptadores;

import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.EnderecoDto;
import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoDestinatarioServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoDestinatarioRepositoryPort;

public class EnderecoDestinatarioServiceImpl implements EnderecoDestinatarioServicePort{

    private final EnderecoDestinatarioRepositoryPort enderecoDestinatarioRepositoryPort;

    public EnderecoDestinatarioServiceImpl(EnderecoDestinatarioRepositoryPort enderecoDestinatarioRepositoryPort){
        this.enderecoDestinatarioRepositoryPort = enderecoDestinatarioRepositoryPort;
    }


    @Override
    public EnderecoDestinatario cadastrarEnderecoDestinatario(EnderecoDto enderecoDto) {
        
        EnderecoDestinatario enderecoDestinatario = new EnderecoDestinatario(enderecoDto);

        return enderecoDestinatarioRepositoryPort.cadastrarEnderecoDestinatario(enderecoDestinatario);
    }

    @Override
    public EnderecoDestinatario atualizarEnderecoDestinatario(EnderecoPutRequest enderecoPut) {
        EnderecoDestinatario enderecoDestinatario = new EnderecoDestinatario(enderecoPut);

        return enderecoDestinatarioRepositoryPort.cadastrarEnderecoDestinatario(enderecoDestinatario);
    }

    @Override
    public void remover(EnderecoDto enderecoDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    
}
