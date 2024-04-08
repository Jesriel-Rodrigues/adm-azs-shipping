package com.fretes.azchip.v1.dominio.enums;

public enum StatusFrete {
    
    EM_ANDAMENTO("Em andamento"),
    FINALIZADO("Finalizado");

    private String descricao;

    
    private StatusFrete(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
