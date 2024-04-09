package com.fretes.azchip.v1.infra.adaptadores.repositories;

import org.springframework.stereotype.Service;

import com.fretes.azchip.v1.dominio.dtos.EnderecoDto;
import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;
import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoDestinatarioRepositoryPort;
import com.fretes.azchip.v1.infra.adaptadores.entities.EnderecoDestinatarioEntity;
import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringEnderecoDestinatarioRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class EnderecoDestinatarioRepository implements EnderecoDestinatarioRepositoryPort{

    private final SpringEnderecoDestinatarioRepository springEnderecoDestinatarioRepository;

    @Override
    public EnderecoDestinatario cadastrarEnderecoDestinatario(EnderecoDestinatario enderecoDestinatario) {
        
        EnderecoDestinatarioEntity enderecoDestinatarioEntity = new EnderecoDestinatarioEntity(enderecoDestinatario);
        enderecoDestinatarioEntity = springEnderecoDestinatarioRepository.save(enderecoDestinatarioEntity);

        return enderecoDestinatarioEntity.toEnderecoDestinatario();
    }

    @Override
    public EnderecoDestinatario atualizarEnderecoDestinatario(EnderecoDestinatario enderecoPut) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarEnderecoDestinatario'");
    }

    @Override
    public void remover(EnderecoDto enderecoDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    
}
