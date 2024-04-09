package com.fretes.azchip.v1.dominio.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.dtos.FreteDto;
import com.fretes.azchip.v1.dominio.dtos.put.FretePutRequest;
import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.enums.TipoCalculo;

public class Frete {
    
    private UUID uuid;
    private String nomePacote;
    private LocalDateTime dataPostagem;
    private EnderecoRemetente enderecoRemetente;
    private EnderecoDestinatario enderecoDestinatario;
    private Double peso;
    private Cubagem cubagem;
    private StatusFrete status;
    private TipoCalculo tipoCalculo;

    
    public Frete(){
    }

    

    public Frete(UUID uuid, String nomePacote, LocalDateTime dataPostagem, EnderecoRemetente enderecoRemetente,
            EnderecoDestinatario enderecoDestinatario, Double peso, Cubagem cubagem, StatusFrete status,
            TipoCalculo tipoCalculo) {
        this.uuid = uuid;
        this.nomePacote = nomePacote;
        this.dataPostagem = dataPostagem;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.peso = peso;
        this.cubagem = cubagem;
        this.status = status;
        this.tipoCalculo = tipoCalculo;
    }



    public Frete(FreteDto freteDto) {
        
        this.nomePacote = freteDto.getNomePacote();
        this.dataPostagem = freteDto.getDataPostagem();
        this.enderecoRemetente = new EnderecoRemetente(freteDto.getEnderecoRemetente());
        this.enderecoDestinatario =  new EnderecoDestinatario(freteDto.getEnderecoDestinatario());
        this.peso = freteDto.getPeso();
        this.cubagem = new Cubagem(freteDto.getCubagem());
        this.status = freteDto.getStatus();
        this.tipoCalculo = freteDto.getTipoCalculo();
    }

    public Frete(FretePutRequest fretePut) {
        
        this.uuid = fretePut.getUuid();
        this.nomePacote = fretePut.getNomePacote();
        this.dataPostagem = fretePut.getDataPostagem();
        this.enderecoRemetente = new EnderecoRemetente(fretePut.getEnderecoRemetente());
        this.enderecoDestinatario =  new EnderecoDestinatario(fretePut.getEnderecoDestinatario());
        this.peso = fretePut.getPeso();
        this.cubagem = new Cubagem(fretePut.getCubagem());
        this.status = fretePut.getStatus();
        this.tipoCalculo = fretePut.getTipoCalculo();
    }

    public FreteDto toFreteDto() {
        return new FreteDto(
        nomePacote,
        dataPostagem,
        enderecoRemetente.toEnderecoDto(),
        enderecoDestinatario.toEnderecoDto(),
        peso,
        cubagem.toCubagemDto(),
        status,
        tipoCalculo);
    }

    public FretePutRequest toFretePut() {
        return new FretePutRequest(uuid,
        nomePacote,
        dataPostagem,
        enderecoRemetente.toEnderecoDto(),
        enderecoDestinatario.toEnderecoDto(),
        peso,
        cubagem.toCubagemDto(),
        status,
        tipoCalculo);
    }


    public UUID getUuid() {
        return uuid;
    }


    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }


    public String getNomePacote() {
        return nomePacote;
    }


    public void setNomePacote(String nomePacote) {
        this.nomePacote = nomePacote;
    }


    public LocalDateTime getDataPostagem() {
        return dataPostagem;
    }


    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.dataPostagem = dataPostagem;
    }


    public EnderecoRemetente getEnderecoRemetente() {
        return enderecoRemetente;
    }


    public void setEnderecoRemetente(EnderecoRemetente enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }


    public EnderecoDestinatario getEnderecoDestinatario() {
        return enderecoDestinatario;
    }


    public void setEnderecoDestinatario(EnderecoDestinatario enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public Cubagem getCubagem() {
        return cubagem;
    }


    public void setCubagem(Cubagem cubagem) {
        this.cubagem = cubagem;
    }


    public StatusFrete getStatus() {
        return status;
    }


    public void setStatus(StatusFrete status) {
        this.status = status;
    }


    public TipoCalculo getTipoCalculo() {
        return tipoCalculo;
    }


    public void setTipoCalculo(TipoCalculo tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }
}
