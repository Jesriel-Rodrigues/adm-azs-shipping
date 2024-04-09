package com.fretes.azchip.v1.dominio.enums;

public enum TipoCalculo {

    PESO("Peso"),
    CUBAGEM("Cubagem"),
    PESO_E_CUBAGEM("Peso e cubagem");

    private String descricao;

    
    private TipoCalculo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
