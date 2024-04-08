package com.fretes.azchip.infra.configuração;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fretes.azchip.dominio.adaptadores.FreteServiceImpl;
import com.fretes.azchip.dominio.ports.interfaces.FreteServicePort;
import com.fretes.azchip.dominio.ports.repositories.FreteRepositoryPort;

@Configuration
public class ConfigFreteService {
    
    @Bean
    FreteServicePort freteService( FreteRepositoryPort freteRepositoryPort){
        return new FreteServiceImpl(freteRepositoryPort);
    }
}
