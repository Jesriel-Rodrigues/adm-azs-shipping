package com.fretes.azchip.v1.dominio.model;

import com.fretes.azchip.v1.dominio.dtos.put.CubagemPutRequest;
import com.fretes.azchip.v1.dominio.dtos.request.CubagemDto;
import com.fretes.azchip.v1.dominio.dtos.response.CubagemResponse;

public class Cubagem {

    private Long id;
    private Double alturaCm;
    private Double larguraCm;
    private Double comprimentoCm;


    public Cubagem(Long id, Double alturaCm, Double larguraCm, Double comprimentoCm) {
        this.id = id;
        this.alturaCm = alturaCm;
        this.larguraCm = larguraCm;
        this.comprimentoCm = comprimentoCm;
    }

    public Cubagem( CubagemDto cubagemDto) {
        this.alturaCm = cubagemDto.getAlturaCm();
        this.larguraCm = cubagemDto.getLarguraCm();
        this.comprimentoCm = cubagemDto.getComprimentoCm();
    }

    public Cubagem( CubagemResponse cubagemResponse) {
        this.id = cubagemResponse.getId();
        this.alturaCm = cubagemResponse.getAlturaCm();
        this.larguraCm = cubagemResponse.getLarguraCm();
        this.comprimentoCm = cubagemResponse.getComprimentoCm();
    }

    public Cubagem( CubagemPutRequest cubagemPut) {
        this.id = cubagemPut.getId();
        this.alturaCm = cubagemPut.getAlturaCm();
        this.larguraCm = cubagemPut.getLarguraCm();
        this.comprimentoCm = cubagemPut.getComprimentoCm();
    }

    public CubagemDto toCubagemDto(){
        return new CubagemDto(alturaCm, larguraCm, comprimentoCm);
    }

    public CubagemResponse toCubagemResponse(){
        return new CubagemResponse(id, alturaCm, larguraCm, comprimentoCm);
    }

    public CubagemPutRequest toCubagemPut(){
        return new CubagemPutRequest(id, alturaCm, larguraCm, comprimentoCm);
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
