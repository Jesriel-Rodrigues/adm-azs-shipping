package com.fretes.azchip.v1.dominio.adaptadores;

import java.util.List;
import java.util.stream.Collectors;

import com.fretes.azchip.v1.dominio.dtos.CubagemDto;
import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.model.Cubagem;
import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;
import com.fretes.azchip.v1.dominio.model.EnderecoRemetente;
import com.fretes.azchip.v1.dominio.model.Frete;
import com.fretes.azchip.v1.dominio.ports.interfaces.CubagemServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoDestinatarioServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoRemetenteServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;

public class FreteServiceImpl implements FreteServicePort{

    private final CubagemServicePort cubagemServicePort;
    private final EnderecoDestinatarioServicePort enderecoDestinatarioServicePort;
    private final EnderecoRemetenteServicePort enderecoRemetenteServicePort;

    private final FreteRepositoryPort freteRepository;

    public FreteServiceImpl (
            FreteRepositoryPort freteRepository,
            CubagemServicePort cubagemServicePort,
            EnderecoDestinatarioServicePort enderecoDestinatarioRepositoryPort,
            EnderecoRemetenteServicePort enderecoRemetenteServicePort
        ){
        this.freteRepository = freteRepository;
        this.cubagemServicePort = cubagemServicePort;
        this.enderecoDestinatarioServicePort = enderecoDestinatarioRepositoryPort;
        this.enderecoRemetenteServicePort = enderecoRemetenteServicePort;
    }

    @Override
    public List<FreteDto> buscarTodosPorStatus(StatusFrete status) {
        
        return null;
        // List<Frete> fretes = freteRepository.buscarTodosPorStatus(status);
        // return  fretes.stream()
        //     .map(Frete::toFreteDto)
        // .collect(Collectors.toList());
    }


    @Override
    public FreteDto cadastrarFrete(FreteDto freteDto) {
        
        Frete frete = new Frete(freteDto);

        Cubagem cubagem = cubagemServicePort.cadastrarCubagem(freteDto.getCubagem());
        EnderecoDestinatario enderecoDestinatario = enderecoDestinatarioServicePort.cadastrarEnderecoDestinatario(freteDto.getEnderecoDestinatario());
        EnderecoRemetente enderecoRemetente = enderecoRemetenteServicePort.cadastrarEnderecoRemetente(freteDto.getEnderecoRemetente());

        frete.setCubagem(cubagem);
        frete.setEnderecoDestinatario(enderecoDestinatario);
        frete.setEnderecoRemetente(enderecoRemetente);
                
        frete = freteRepository.cadastrarFrete(frete);

        return frete.toFreteDto();
    }

    @Override
    public FretePutRequest atualizarFrete(FretePutRequest fretePut) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarFrete'");
    }

    @Override
    public void remover(FreteDto freteDto) {
        
        Frete frete = new Frete(freteDto);
        
        freteRepository.remover(frete);
    }
    
}
