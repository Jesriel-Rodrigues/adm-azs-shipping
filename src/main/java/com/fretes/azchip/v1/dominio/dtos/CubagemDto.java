package com.fretes.azchip.v1.dominio.dtos;

public class CubagemDto {

    private Double alturaCm;
    private Double larguraCm;
    private Double comprimentoCm;


    public CubagemDto(Double alturaCm, Double larguraCm, Double comprimentoCm) {

        this.alturaCm = alturaCm;
        this.larguraCm = larguraCm;
        this.comprimentoCm = comprimentoCm;
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
