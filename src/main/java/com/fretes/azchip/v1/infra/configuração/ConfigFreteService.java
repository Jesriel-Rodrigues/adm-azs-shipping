package com.fretes.azchip.v1.infra.configuração;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import com.fretes.azchip.v1.dominio.adaptadores.CubagemServiceImpl;
import com.fretes.azchip.v1.dominio.adaptadores.EnderecoDestinatarioServiceImpl;
import com.fretes.azchip.v1.dominio.adaptadores.EnderecoRemetenteServiceImpl;
import com.fretes.azchip.v1.dominio.adaptadores.FreteServiceImpl;
import com.fretes.azchip.v1.dominio.ports.interfaces.CubagemServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoDestinatarioServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.EnderecoRemetenteServicePort;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.v1.dominio.ports.repositories.CubagemRepositoryPort;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoDestinatarioRepositoryPort;
import com.fretes.azchip.v1.dominio.ports.repositories.EnderecoRemetenteRepositoryPort;
import com.fretes.azchip.v1.dominio.ports.repositories.FreteRepositoryPort;

@Configuration
public class ConfigFreteService {

    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
    
    @Bean
    FreteServicePort freteService(FreteRepositoryPort freteRepository){
        return new FreteServiceImpl(freteRepository);
    }

    @Bean
    public CubagemServicePort cubagemService(CubagemRepositoryPort cubagemRepositoryPort){
        return new CubagemServiceImpl(cubagemRepositoryPort);
    }

    @Bean
    public EnderecoDestinatarioServicePort enderecoDestinatarioServicePort(EnderecoDestinatarioRepositoryPort enderecoDestinatarioRepositoryPort){
        return new EnderecoDestinatarioServiceImpl(enderecoDestinatarioRepositoryPort);
    }

    @Bean
    public EnderecoRemetenteServicePort enderecoRemetenteServicePort(EnderecoRemetenteRepositoryPort enderecoRemetenteRepositoryPort){
        return new EnderecoRemetenteServiceImpl(enderecoRemetenteRepositoryPort);
    }
}
