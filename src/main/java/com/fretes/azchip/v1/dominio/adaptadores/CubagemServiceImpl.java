package com.fretes.azchip.v1.dominio.adaptadores;

import com.fretes.azchip.v1.dominio.dtos.put.CubagemPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.CubagemDto;
import com.fretes.azchip.v1.dominio.model.Cubagem;
import com.fretes.azchip.v1.dominio.ports.interfaces.CubagemServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.CubagemRepositoryPort;

public class CubagemServiceImpl implements CubagemServicePort{

    private final CubagemRepositoryPort cubagemRepositoryPort;

    public CubagemServiceImpl( CubagemRepositoryPort cubagemRepositoryPort){
        this.cubagemRepositoryPort = cubagemRepositoryPort;
    }

    @Override
    public Cubagem cadastrarCubagem(CubagemDto cubagemDto) {

        Cubagem cubagem = new Cubagem(cubagemDto);
        
        return cubagemRepositoryPort.cadastrarCubagem(cubagem);
    }

    @Override
    public Cubagem atualizarCubagem(CubagemPutRequest cubagemPut) {

        Cubagem cubagem = new Cubagem(cubagemPut);
        
        return cubagemRepositoryPort.cadastrarCubagem(cubagem);
    }

    @Override
    public void remover(CubagemDto freteDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }
    
}
