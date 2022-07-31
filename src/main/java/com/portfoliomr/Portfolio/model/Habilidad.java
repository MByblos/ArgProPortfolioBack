
package com.portfoliomr.Portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "habilidades")
public class Habilidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "hab_id")
    private Long habId;
    @Column (name = "habilidad")
    private String habilidad;
    @Column (name = "hab_nivel")
    private int habNivel;
    
    public Habilidad(){}
    
    public Habilidad(Long Id, String Habilidad, int Nivel){
        this.habId = Id;
        this.habilidad = Habilidad;
        this.habNivel = Nivel;
    }
    
}
