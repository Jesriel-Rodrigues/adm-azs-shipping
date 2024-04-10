package com.fretes.azchip.v1.infra.adaptadores.repositories;

import org.springframework.stereotype.Service;

import com.fretes.azchip.v1.dominio.model.Cubagem;
import com.fretes.azchip.v1.dominio.ports.repositories.CubagemRepositoryPort;
import com.fretes.azchip.v1.infra.adaptadores.entities.CubagemEntity;
import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringCubagemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CubagemRepository implements CubagemRepositoryPort{

    private final SpringCubagemRepository springCubagemRepository;


    @Override
    public Cubagem cadastrarCubagem(Cubagem cubagem) {
        
        CubagemEntity cubagemEntity = new CubagemEntity(cubagem);
        cubagemEntity = springCubagemRepository.save(cubagemEntity);

        return cubagemEntity.toCubagem();
    }

}
