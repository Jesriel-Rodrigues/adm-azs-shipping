package com.fretes.azchip.v1.infra.adaptadores.repositories;

import org.springframework.stereotype.Service;

import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoRemetenteRepositoryPort;
import com.fretes.azchip.v1.infra.adaptadores.entities.EnderecoRemetenteEntity;
import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringEnderecoRemetenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EnderecoRemetenteRepository implements EnderecoRemetenteRepositoryPort{

    private final SpringEnderecoRemetenteRepository springEnderecoRemetenteRepository;

    @Override
    public EnderecoRemetente cadastrarEnderecoRemetente(EnderecoRemetente enderecoRemetente) {
        
        EnderecoRemetenteEntity enderecoDestinatarioEntity = new EnderecoRemetenteEntity(enderecoRemetente);
        enderecoDestinatarioEntity = springEnderecoRemetenteRepository.save(enderecoDestinatarioEntity);

        return enderecoDestinatarioEntity.toEnderecoRemetente();
    } 
}
