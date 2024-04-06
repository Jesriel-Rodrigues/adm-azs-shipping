package com.fretes.azchip.dominio.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public class FreteDto {

    private UUID uuid;
    private LocalDateTime dataSaida;
    private LocalDateTime dataChegada;
    private String localRemetente;
    private String localDestinatario;
    private String status;
    private String placaCarro;



    public FreteDto(UUID uuid, LocalDateTime dataSaida, LocalDateTime dataChegada, String localRemetente,
            String localDestinatario, String status, String placaCarro) {
        this.uuid = uuid;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.localRemetente = localRemetente;
        this.localDestinatario = localDestinatario;
        this.status = status;
        this.placaCarro = placaCarro;
    }
    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    public LocalDateTime getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }
    public LocalDateTime getDataChegada() {
        return dataChegada;
    }
    public void setDataChegada(LocalDateTime dataChegada) {
        this.dataChegada = dataChegada;
    }
    public String getLocalRemetente() {
        return localRemetente;
    }
    public void setLocalRemetente(String localRemetente) {
        this.localRemetente = localRemetente;
    }
    public String getLocalDestinatario() {
        return localDestinatario;
    }
    public void setLocalDestinatario(String localDestinatario) {
        this.localDestinatario = localDestinatario;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPlacaCarro() {
        return placaCarro;
    }
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    
}
