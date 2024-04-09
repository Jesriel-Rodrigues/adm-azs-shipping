package com.fretes.azchip.v1.infra.adaptadores.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fretes.azchip.exceptions.ResourceNotFoundException;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.model.Frete;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;
import com.fretes.azchip.v1.infra.adaptadores.entities.FreteEntity;
import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringFreteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FreteRepository implements FreteRepositoryPort{

    private final SpringFreteRepository springFreteRepository;

    @Override
    public List<Frete> buscarTodosPorStatus(StatusFrete status) {

        if (status != null) {
            return springFreteRepository.buscarTodosPorStatus(status.name()).stream()
                .map(FreteEntity::toFrete)
            .collect(Collectors.toList());
        }else{
            return springFreteRepository.findAll().stream()
                .map(FreteEntity::toFrete)
            .collect(Collectors.toList());
        }
    }

    @Override
    public Frete buscarPorUuid(UUID uuid) {
        Optional<FreteEntity> freteOpt = springFreteRepository.findById(uuid);

        if (freteOpt.isPresent()) {
            return freteOpt.get().toFrete();
        }

        throw new ResourceNotFoundException("Frete Não encontrado");
    }

    @Override
    public Frete cadastrarFrete(Frete frete) {

        FreteEntity freteEntity = new FreteEntity(frete);

        freteEntity = springFreteRepository.save(freteEntity);
        
        return freteEntity.toFrete();
    }

    @Override
    public void remover(Frete frete) {
        
        FreteEntity freteEntity = new FreteEntity(frete);

        springFreteRepository.delete(freteEntity);
    }
}
