package com.fretes.azchip.v1.infra.configuração;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import com.fretes.azchip.v1.dominio.adaptadores.FreteServiceImpl;
import com.fretes.azchip.v1.dominio.ports.interfaces.FreteServicePort;
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
}
