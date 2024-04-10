package com.fretes.azchip.v1.dominio.adaptadores;

import org.springframework.data.domain.Page;

import java.util.UUID;

import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.response.FreteResponse;
import com.fretes.azchip.v1.dominio.model.Frete;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;

public class FreteServiceImpl implements FreteServicePort{

    private final FreteRepositoryPort freteRepository;

    public FreteServiceImpl (FreteRepositoryPort freteRepository){
        this.freteRepository = freteRepository;
    }


    @Override
    public FreteResponse buscarPorUuidResponse(String freteUuid) {

        Frete frete = freteRepository.buscarPorUuid(UUID.fromString(freteUuid));
        
        return frete.toFreteResponse();
    }

    public Frete buscarPorUuid(String freteUuid) {
        return freteRepository.buscarPorUuid(UUID.fromString(freteUuid));
    }

    @Override
    public Page<FreteResponse> buscarTodosPorStatus(String parametro) {
        
        Page<Frete> pageFrete = freteRepository.buscarTodosPorStatus(parametro);
        return pageFrete.map(Frete::toFreteResponse);
    }


    @Override
    public FreteResponse cadastrarFrete(FreteDto freteDto) {
        
        Frete frete = new Frete(freteDto);

        frete = freteRepository.cadastrarFrete(frete);

        return frete.toFreteResponse();
    }

    @Override
    public FreteResponse atualizarFrete(FretePutRequest fretePut) {
        
        Frete frete = new Frete(fretePut);

        frete = freteRepository.atualizarFrete(frete);

        return frete.toFreteResponse();
    }

    @Override
    public void remover(String freteUuid) {

        Frete frete = buscarPorUuid(freteUuid);
                
        freteRepository.remover(frete);
    }
    
}
