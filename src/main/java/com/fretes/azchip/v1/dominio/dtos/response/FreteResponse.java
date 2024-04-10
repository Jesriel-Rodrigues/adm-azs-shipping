package com.fretes.azchip.v1.dominio.dtos.response;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.enums.TipoCalculo;

public class FreteResponse {
    
    private UUID uuid;
    private String nomePacote;
    private LocalDateTime dataPostagem;
    private EnderecoResponse enderecoRemetente;
    private EnderecoResponse enderecoDestinatario;
    private Double peso;
    private CubagemResponse cubagem;
    private StatusFrete status;
    private TipoCalculo tipoCalculo;

    
    public FreteResponse(){
    }

    

    public FreteResponse(UUID uuid, String nomePacote, LocalDateTime dataPostagem, EnderecoResponse enderecoRemetente,
    EnderecoResponse enderecoDestinatario, Double peso, CubagemResponse cubagem, StatusFrete status,
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

    public EnderecoResponse getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(EnderecoResponse enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public EnderecoResponse getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(EnderecoResponse enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public CubagemResponse getCubagem() {
        return cubagem;
    }

    public void setCubagem(CubagemResponse cubagem) {
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
