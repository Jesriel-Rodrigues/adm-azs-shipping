package com.fretes.azchip.v1.dominio.dtos.request;

import java.time.LocalDateTime;

import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.enums.TipoCalculo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FreteDto {

    @NotBlank(message = "nomePacote nao pode ser nulo")
    private String nomePacote;
    
    @NotNull(message = "dataPostagem nao pode ser nulo")
    private LocalDateTime dataPostagem;

    @NotNull(message = "enderecoRemetente nao pode ser nulo")
    @Valid
    private EnderecoDto enderecoRemetente;

    @NotNull(message = "enderecoDestinatario nao pode ser nulo")
    @Valid
    private EnderecoDto enderecoDestinatario;

    private Double peso;

    @Valid
    private CubagemDto cubagem;

    @NotNull(message = "status nao pode ser nulo")
    private StatusFrete status;

    @NotNull(message = "tipoCalculo nao pode ser nulo")
    private TipoCalculo tipoCalculo;

    
    public FreteDto(){
    }

    public FreteDto(String nomePacote, LocalDateTime dataPostagem, EnderecoDto enderecoRemetente,
    EnderecoDto enderecoDestinatario, Double peso, CubagemDto cubagem, StatusFrete status,
            TipoCalculo tipoCalculo) {
        this.nomePacote = nomePacote;
        this.dataPostagem = dataPostagem;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.peso = peso;
        this.cubagem = cubagem;
        this.status = status;
        this.tipoCalculo = tipoCalculo;
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

    public EnderecoDto getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(EnderecoDto enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public EnderecoDto getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(EnderecoDto enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public CubagemDto getCubagem() {
        return cubagem;
    }

    public void setCubagem(CubagemDto cubagem) {
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
