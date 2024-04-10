package com.fretes.azchip.v1.dominio.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EnderecoDto {
    
    @NotBlank(message = "nomeRua nao pode ser nulo")
    private String nomeRua;

    @NotBlank(message = "numeroCasa nao pode ser nulo")
    private String numeroCasa;

    @NotBlank(message = "bairro nao pode ser nulo")
    private String bairro;

    @NotBlank(message = "cidade nao pode ser nulo")
    private String cidade;

    @NotBlank(message = "estado nao pode ser nulo")
    private String estado;

    @NotNull(message = "cep nao pode ser nulo")
    private int cep;

    private String complemento;


    public EnderecoDto(String nomeRua, String numeroCasa, String bairro, String cidade, String estado, int cep,
            String complemento) {

        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }


    public String getNomeRua() {
        return nomeRua;
    }


    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }


    public String getNumeroCasa() {
        return numeroCasa;
    }


    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getCep() {
        return cep;
    }


    public void setCep(int cep) {
        this.cep = cep;
    }


    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
