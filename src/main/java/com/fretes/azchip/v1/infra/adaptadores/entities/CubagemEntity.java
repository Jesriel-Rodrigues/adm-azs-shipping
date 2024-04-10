package com.fretes.azchip.v1.infra.adaptadores.entities;

import com.fretes.azchip.v1.dominio.model.Cubagem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cubagem")
public class CubagemEntity {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(columnDefinition = "numeric")
    private Double alturaCm;

    @Column(columnDefinition = "numeric")
    private Double larguraCm;

    @Column(columnDefinition = "numeric")
    private Double comprimentoCm;


    public CubagemEntity(){
    }

    public CubagemEntity(Long id, Double alturaCm, Double larguraCm, Double comprimentoCm) {
        this.id = id;
        this.alturaCm = alturaCm;
        this.larguraCm = larguraCm;
        this.comprimentoCm = comprimentoCm;
    }

    public CubagemEntity (Cubagem cubagem){
        this.id = cubagem.getId();
        this.alturaCm = cubagem.getAlturaCm();
        this.larguraCm = cubagem.getLarguraCm();
        this.comprimentoCm = cubagem.getComprimentoCm();
    }

    public Cubagem toCubagem(){
        return new Cubagem(id, alturaCm, larguraCm, comprimentoCm);
    }
}
