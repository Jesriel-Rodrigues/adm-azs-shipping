package com.fretes.azchip.v1.dominio.dtos.put;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.enums.TipoCalculo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class FretePutRequest {
    
    @NotNull(message = "uuid nao pode ser nulo")
    private UUID uuid;

    @NotBlank(message = "nomePacote nao pode ser nulo")
    private String nomePacote;

    @NotNull(message = "dataPostagem nao pode ser nulo")
    private LocalDateTime dataPostagem;

    @NotNull(message = "enderecoRemetente nao pode ser nulo")
    @Valid
    private EnderecoPutRequest enderecoRemetente;

    @NotNull(message = "enderecoDestinatario nao pode ser nulo")
    @Valid
    private EnderecoPutRequest enderecoDestinatario;

    private Double peso;

    @Valid
    private CubagemPutRequest cubagem;

    @NotNull(message = "status nao pode ser nulo")
    private StatusFrete status;

    @NotNull(message = "tipoCalculo nao pode ser nulo")
    private TipoCalculo tipoCalculo;

    
    public FretePutRequest(){
    }

    
    public FretePutRequest(UUID uuid, String nomePacote, LocalDateTime dataPostagem, EnderecoPutRequest enderecoRemetente,
    EnderecoPutRequest enderecoDestinatario, Double peso, CubagemPutRequest cubagem, StatusFrete status,
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

    public EnderecoPutRequest getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(EnderecoPutRequest enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public EnderecoPutRequest getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(EnderecoPutRequest enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public CubagemPutRequest getCubagem() {
        return cubagem;
    }

    public void setCubagem(CubagemPutRequest cubagem) {
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
