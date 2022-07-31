
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
@Table (name = "proyectos")        

public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "proy_id")
    private Long proyId;
    @Column (name = "proy_nombre")
    private String proyNombre;
    @Column (name = "proy_descripcion")
    private String proyDescripcion;
    @Column (name = "proy_estado")
    private String proyEstado;


    public Proyecto(){}

    public Proyecto(Long Id, String NombreProy, String DescripcionProy, String EstadoProy){
        this.proyId = Id;
        this.proyNombre = NombreProy;
        this.proyDescripcion = DescripcionProy;
        this.proyEstado = EstadoProy;
    }
    
    
    
    
    

}
