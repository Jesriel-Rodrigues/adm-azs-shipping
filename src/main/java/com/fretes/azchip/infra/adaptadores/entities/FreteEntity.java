package com.fretes.azchip.infra.adaptadores.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fretes.azchip.dominio.Frete;
import com.fretes.azchip.dominio.enums.StatusFrete;

@Data
@Entity
@Table(name = "frete")
public class FreteEntity {
    

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private LocalDateTime dataSaida;

    private LocalDateTime dataChegada;

    private String localRemetente;

    private String localDestinatario;

    @Enumerated(EnumType.STRING)
    private StatusFrete status;

    private String placaCarro;

    public Frete toFrete(){
        return new Frete(this.uuid, this.dataSaida, this.dataChegada, this.localRemetente, this.localDestinatario, this.status, this.placaCarro);
    }

    public FreteEntity(Frete frete) {
        this.uuid = frete.getUuid();
        this.dataSaida = frete.getDataSaida();
        this.dataChegada = frete.getDataChegada();
        this.localRemetente = frete.getLocalRemetente();
        this.localDestinatario = frete.getLocalDestinatario();
        this.status = frete.getStatus();
        this.placaCarro = frete.getPlacaCarro();
    }

    public FreteEntity (){

    }

    public FreteEntity(UUID uuid, LocalDateTime dataSaida, LocalDateTime dataChegada, String localRemetente,
            String localDestinatario, StatusFrete status, String placaCarro) {
        this.uuid = uuid;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.localRemetente = localRemetente;
        this.localDestinatario = localDestinatario;
        this.status = status;
        this.placaCarro = placaCarro;
    }
}
