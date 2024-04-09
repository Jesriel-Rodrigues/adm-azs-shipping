package com.fretes.azchip.v1.infra.adaptadores.entities;

import com.fretes.azchip.v1.dominio.model.EnderecoDestinatario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "endereco_destinatario")
public class EnderecoDestinatarioEntity {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeRua;
    private String numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;


    public EnderecoDestinatarioEntity(){
    }

    public EnderecoDestinatarioEntity(Long id, String nomeRua, String numeroCasa, String bairro, String cidade,
            String estado, int cep, String complemento) {
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public EnderecoDestinatarioEntity(EnderecoDestinatario enderecoDestinatario) {
        this.id = enderecoDestinatario.getId();
        this.nomeRua = enderecoDestinatario.getNomeRua();
        this.numeroCasa = enderecoDestinatario.getNumeroCasa();
        this.bairro = enderecoDestinatario.getBairro();
        this.cidade = enderecoDestinatario.getCidade();
        this.estado = enderecoDestinatario.getEstado();
        this.cep = enderecoDestinatario.getCep();
        this.complemento = enderecoDestinatario.getComplemento();
    }
    
    public EnderecoDestinatario toEnderecoDestinatario(){
        return new EnderecoDestinatario(id, nomeRua, numeroCasa, bairro, cidade, estado, cep, complemento);
    }
}
