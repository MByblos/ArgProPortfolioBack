
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
        
@Table(name = "estudios")
public class Estudio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "est_id")
    private Long estId;
    @Column (name = "carrera")
    private String carrera;
    @Column (name = "institucion")
    private String institucion;
    @Column (name = "est_ini")
    private int estFechaIni;
    @Column (name = "est_fin")
    private int estFechaFin;
    @Column (name = "est_inst_logo")
    private String estInstLogo;
    


    public Estudio(){}

    public Estudio(Long Id, String Titulo, String Institucion, int AnioIniEst, int AnioFinEst, String EstInstLogo){
        this.estId = Id;
        this.carrera = Titulo;
        this.institucion = Institucion;
        this.estFechaIni = AnioIniEst;
        this.estFechaFin = AnioFinEst;
        this.estInstLogo = EstInstLogo;
    }
    

}
