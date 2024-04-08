package com.fretes.azchip.v1.utils;

import java.time.LocalDateTime;

import com.fretes.azchip.exceptions.ResourceBadRequestException;
import com.fretes.azchip.v1.dominio.Frete;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;

public final class ValidarFrete {

    private ValidarFrete() {
        throw new UnsupportedOperationException("Esta é uma classe utilitária e não pode ser instanciada");
    }
    
    public static void validarFrete( Frete frete ){

        validarDataSaida(frete);

        if (frete.getStatus().equals(StatusFrete.EM_ANDAMENTO)) {
            validarDataChegada(frete);
        } else if (frete.getStatus().equals(StatusFrete.FINALIZADO)) {
            validarDataChegada(frete);
            validarFinalizado(frete);
        }
    }

    private static void validarDataSaida(Frete frete) {
        if (frete.getDataSaida() == null) {
            throw new ResourceBadRequestException("Data inicial não pode ser vazia!");
        }
    }
    
    private static void validarDataChegada(Frete frete) {
        if (frete.getDataChegada() != null && isDataSaidaAntesDataChegada(frete.getDataSaida(), frete.getDataChegada())) {
            throw new ResourceBadRequestException("Data inicial não pode ser maior que data final!");
        }
    }
    
    private static void validarFinalizado(Frete frete) {
        if (frete.getLocalDestinatario() == null) {
            throw new ResourceBadRequestException("Local Destinatario não pode ser vazio!");
        }
    
        if (frete.getLocalRemetente() == null) {
            throw new ResourceBadRequestException("Local Remetente não pode ser vazio!");
        }
    
        if (frete.getPlacaCarro() == null) {
            throw new ResourceBadRequestException("Placa do carro não pode ser vazio!");
        }
    }

    public static boolean isDataSaidaAntesDataChegada(LocalDateTime dataSaida, LocalDateTime dataChegada) {
        return dataSaida.isAfter(dataChegada);
    }
}
