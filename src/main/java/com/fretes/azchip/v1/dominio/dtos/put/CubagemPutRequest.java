package com.fretes.azchip.v1.dominio.dtos.put;

import jakarta.validation.constraints.NotNull;

public class CubagemPutRequest {

    @NotNull(message = "id nao pode ser nulo")
    private Long id;

    @NotNull(message = "alturaCm nao pode ser nulo")
    private Double alturaCm;

    @NotNull(message = "larguraCm nao pode ser nulo")
    private Double larguraCm;
    
    @NotNull(message = "comprimentoCm nao pode ser nulo")
    private Double comprimentoCm;


    public CubagemPutRequest(Long id, Double alturaCm, Double larguraCm, Double comprimentoCm) {
        this.id = id;
        this.alturaCm = alturaCm;
        this.larguraCm = larguraCm;
        this.comprimentoCm = comprimentoCm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Double getAlturaCm() {
        return alturaCm;
    }


    public void setAlturaCm(Double alturaCm) {
        this.alturaCm = alturaCm;
    }


    public Double getLarguraCm() {
        return larguraCm;
    }


    public void setLarguraCm(Double larguraCm) {
        this.larguraCm = larguraCm;
    }


    public Double getComprimentoCm() {
        return comprimentoCm;
    }


    public void setComprimentoCm(Double comprimentoCm) {
        this.comprimentoCm = comprimentoCm;
    }
}
