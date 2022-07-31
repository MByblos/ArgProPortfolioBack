
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
        
@Table (name = "experiencias")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "exp_id")
    private Long expId;
    @Column (name = "exp_empresa")
    private String expEmpresa;
    @Column (name = "exp_descripcion")
    private String expDescripcion;
    @Column (name = "exp_ini")
    private int expFechaIni;
    @Column (name = "exp_fin")
    private String expFechaFin;
    @Column (name = "exp_estado")
    private String expEstado;
    
    


    public Experiencia(){
    
    }

    public Experiencia(Long Id, String Empresa, String DescripcionExp, int AnioIniExp, String AnioFinExp, String EstadoExp){
        this.expId = Id;
        this.expEmpresa = Empresa;
        this.expDescripcion = DescripcionExp;
        this.expFechaIni = AnioIniExp;
        this.expFechaFin = AnioFinExp;
        this.expEstado = EstadoExp ;
    }

}
