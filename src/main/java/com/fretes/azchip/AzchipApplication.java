package com.fretes.azchip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fretes.azchip.v1.infra.adaptadores.repositories.spring.SpringFreteRepository;


@EnableJpaRepositories(basePackageClasses = SpringFreteRepository.class)
@SpringBootApplication
public class AzchipApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzchipApplication.class, args);
	}

}
