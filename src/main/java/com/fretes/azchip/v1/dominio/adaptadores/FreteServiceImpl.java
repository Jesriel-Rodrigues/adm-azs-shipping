package com.fretes.azchip.v1.dominio.adaptadores;

import java.util.List;
import java.util.stream.Collectors;

import com.fretes.azchip.v1.dominio.Frete;
import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;

public class FreteServiceImpl implements FreteServicePort{

    private final FreteRepositoryPort freteRepository;

    public FreteServiceImpl (FreteRepositoryPort freteRepository){
        this.freteRepository = freteRepository;
    }

    @Override
    public List<FreteDto> buscarTodosPorStatus(StatusFrete status) {
        
        List<Frete> fretes = freteRepository.buscarTodosPorStatus(status);
        return  fretes.stream()
            .map(Frete::toFreteDto)
        .collect(Collectors.toList());
    }


    @Override
    public FreteDto salvarEAtualizar(FreteDto freteDto) {
        
       
        
        
        Frete frete = new Frete(freteDto);
        frete = freteRepository.salvarEAtualizar(frete);

        return frete.toFreteDto();
    }


    @Override
    public void remover(FreteDto freteDto) {
        
        Frete frete = new Frete(freteDto);
        
        freteRepository.remover(frete);
    }
    
}