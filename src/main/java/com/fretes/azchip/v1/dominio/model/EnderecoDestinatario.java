package com.fretes.azchip.v1.dominio.model;

import com.fretes.azchip.v1.dominio.dtos.EnderecoDto;
import com.fretes.azchip.v1.dominio.dtos.put.EnderecoPutRequest;

public class EnderecoDestinatario {

    private Long id;
    private String nomeRua;
    private String numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;


    public EnderecoDestinatario(Long id, String nomeRua, String numeroCasa, String bairro, String cidade, String estado, int cep,
            String complemento) {

        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public EnderecoDestinatario(EnderecoDto enderecoDto) {
        this.nomeRua = enderecoDto.getNomeRua();
        this.numeroCasa = enderecoDto.getNumeroCasa();
        this.bairro = enderecoDto.getBairro();
        this.cidade = enderecoDto.getCidade();
        this.estado = enderecoDto.getEstado();
        this.cep = enderecoDto.getCep();
        this.complemento = enderecoDto.getComplemento();
    }

    public EnderecoDestinatario(EnderecoPutRequest enderecoPut) {
        this.id = enderecoPut.getId();
        this.nomeRua = enderecoPut.getNomeRua();
        this.numeroCasa = enderecoPut.getNumeroCasa();
        this.bairro = enderecoPut.getBairro();
        this.cidade = enderecoPut.getCidade();
        this.estado = enderecoPut.getEstado();
        this.cep = enderecoPut.getCep();
        this.complemento = enderecoPut.getComplemento();
    }

    public EnderecoDto toEnderecoDto(){
        return new EnderecoDto(nomeRua, numeroCasa, bairro, cidade, estado, cep, complemento);
    }

    public EnderecoPutRequest toEnderecoPut(){
        return new EnderecoPutRequest(id, nomeRua, numeroCasa, bairro, cidade, estado, cep, complemento);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
