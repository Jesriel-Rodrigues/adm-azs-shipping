package com.fretes.azchip.dominio.adaptadores;

import java.util.List;
import java.util.stream.Collectors;

import java.time.LocalDateTime;

import com.fretes.azchip.dominio.Frete;
import com.fretes.azchip.dominio.dtos.FreteDto;
import com.fretes.azchip.dominio.enums.StatusFrete;
import com.fretes.azchip.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.dominio.ports.repositories.FreteRepositoryPort;

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
        
       
        if (freteDto.getDataSaida() == null) {
            throw new RuntimeException("Data inicial não pode ser vazia!");
        }

        if (isDataSaidaAntesDataChegada(freteDto.getDataSaida(), freteDto.getDataChegada())) {
            throw new RuntimeException("Data inicial não pode ser maior que data final!");
        }
        
        Frete frete = new Frete(freteDto);
        frete = freteRepository.salvarEAtualizar(frete);

        return frete.toFreteDto();
    }


    public boolean isDataSaidaAntesDataChegada(LocalDateTime dataSaida, LocalDateTime dataChegada) {
        return dataChegada == null || !dataSaida.isAfter(dataChegada);
    }


    @Override
    public void remover(FreteDto freteDto) {
        
        Frete frete = new Frete(freteDto);
        
        freteRepository.remover(frete);
    }
    
}
