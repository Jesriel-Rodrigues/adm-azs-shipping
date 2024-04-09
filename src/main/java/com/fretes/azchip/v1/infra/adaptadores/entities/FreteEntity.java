package com.fretes.azchip.v1.infra.adaptadores.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fretes.azchip.v1.dominio.enums.StatusFrete;
import com.fretes.azchip.v1.dominio.enums.TipoCalculo;
import com.fretes.azchip.v1.dominio.model.Frete;

@Data
@Entity
@Table(name = "frete")
public class FreteEntity {
    

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String nomePacote;
    private LocalDateTime dataPostagem;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_remetente_id", referencedColumnName = "id")
    private EnderecoRemetenteEntity enderecoRemetente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_destinatario_id", referencedColumnName = "id")
    private EnderecoDestinatarioEntity enderecoDestinatario;
    
    private Double peso;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cubagem_id", referencedColumnName = "id")
    private CubagemEntity cubagem;
    
    private StatusFrete status;
    private TipoCalculo tipoCalculo;

    public FreteEntity (){
    }

    public FreteEntity(UUID uuid, String nomePacote, LocalDateTime dataPostagem,
            EnderecoRemetenteEntity enderecoRemetente, EnderecoDestinatarioEntity enderecoDestinatario, Double peso,
            CubagemEntity cubagem, StatusFrete status, TipoCalculo tipoCalculo) {
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

    public Frete toFrete(){
        return new Frete(uuid,
        nomePacote,
        dataPostagem,
        enderecoRemetente.toEnderecoRemetente(),
        enderecoDestinatario.toEnderecoDestinatario(),
        peso,
        cubagem.toCubagem(),
        status,
        tipoCalculo);
    }

    public FreteEntity(Frete frete) {
        this.uuid = frete.getUuid();
        this.nomePacote = frete.getNomePacote();
        this.dataPostagem = frete.getDataPostagem();
        this.enderecoRemetente = new EnderecoRemetenteEntity(frete.getEnderecoRemetente());
        this.enderecoDestinatario = new EnderecoDestinatarioEntity(frete.getEnderecoDestinatario());
        this.peso = frete.getPeso();
        this.cubagem = new CubagemEntity(frete.getCubagem());
        this.status = frete.getStatus();
        this.tipoCalculo = frete.getTipoCalculo();
    }
}
