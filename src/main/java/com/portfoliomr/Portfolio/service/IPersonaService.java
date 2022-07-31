
package com.portfoliomr.Portfolio.service;


import com.portfoliomr.Portfolio.model.Estudio;
import com.portfoliomr.Portfolio.model.Experiencia;
import com.portfoliomr.Portfolio.model.Habilidad;
import com.portfoliomr.Portfolio.model.Persona;
import com.portfoliomr.Portfolio.model.Proyecto;
import java.util.List;


public interface IPersonaService {
    
    
    
    /* Persona */
    public Persona verPersona();
    public List<Persona> verPersonas();
    public void editarPersona(Long Id, Persona pers);
    
    /* Experiencia */
    public List<Experiencia> verExperiencias();
    public void agregarExperiencia(Experiencia exp);
    public void editarExperiencia(Long Id, Experiencia exp);
    public void borrarExpereincia(Long Id);
    
    /* Proyectos */
    public List<Proyecto> verProyectos();
    public void agregarProyecto(Proyecto proy);
    public void editarProyecto(Long Id, Proyecto proy);
    public void borrarProyecto(Long Id);
    
    /* Estudios */
    public List<Estudio> verEstudios();
    public void agregarEstudio(Estudio est);
    public void editarEstudio(Long Id, Estudio est);
    public void borraEstudio(Long Id);
    
    /* Habilidades*/
    public List<Habilidad> verHabilidades();
    public void agregarHabilidad(Habilidad hab);
    public void editarHabilidad(Long Id, Habilidad hab);
    public void borraHabilidad(Long Id);
    
}
