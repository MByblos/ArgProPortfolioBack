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
@Table (name = "persona")        

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "user_id")
    private Long id;
    @Column (name = "user_nombre")
    private String nombre;
    @Column (name = "user_cargo")
    private String cargo;
    @Column (name = "user_ciudad")
    private String ciudad;
    @Column (name = "user_telefono")
    private Long telefono;
    @Column (name = "user_mail")
    private String mail;
    @Column (name = "user_descripcion")
    private String descripcion;
    @Column (name = "user_img")
    private String imgURL;
    @Column (name = "user_bg")
    private String background;
    

    public Persona(){}

    public Persona(Long id, String nombre, String cargo, String ciudad, Long telefono, String mail, String descripcion, String imgURL, String background){
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
        this.imgURL = imgURL;
        this.background = background;
    }   

}
