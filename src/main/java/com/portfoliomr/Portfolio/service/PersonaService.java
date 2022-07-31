
package com.portfoliomr.Portfolio.service;


import com.portfoliomr.Portfolio.model.Estudio;
import com.portfoliomr.Portfolio.model.Experiencia;
import com.portfoliomr.Portfolio.model.Habilidad;
import com.portfoliomr.Portfolio.model.Persona;
import com.portfoliomr.Portfolio.model.Proyecto;
import com.portfoliomr.Portfolio.repository.estudioRepository;
import com.portfoliomr.Portfolio.repository.experienciaRepository;
import com.portfoliomr.Portfolio.repository.habilidadRepository;
import com.portfoliomr.Portfolio.repository.personaRepository;
import com.portfoliomr.Portfolio.repository.proyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public personaRepository persoRepo;

    @Autowired
    public experienciaRepository expRepo;
    
    @Autowired
    public proyectoRepository proyectRepo;
    
    @Autowired
    public estudioRepository estudioRepo;
    
    @Autowired
    public habilidadRepository habRepo;
    

/* Persona */
    
    @Override
    public Persona verPersona() {
        return persoRepo.findByNombre("admin").get();
    }
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void editarPersona(Long id, Persona pers) {
        pers.setId(id);
        persoRepo.save(pers);
    }
    
/* Experiencia */
    
    @Override
    public List<Experiencia> verExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void editarExperiencia(Long id, Experiencia exp) {
        exp.setExpId(id);
        expRepo.save(exp);
    }

    @Override
    public void borrarExpereincia(Long Id) {
        expRepo.deleteById(Id);
    }

/* Proyectos */
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyectRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto proy) {
        proyectRepo.save(proy);
    }

    @Override
    public void editarProyecto(Long id, Proyecto proy) {
        proy.setProyId(id);
        proyectRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long Id) {
        proyectRepo.deleteById(Id);
    }

    
/* Estudios */
    
    @Override
    public List<Estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void agregarEstudio(Estudio est) {
        estudioRepo.save(est);
    }

    @Override
    public void editarEstudio(Long id, Estudio est) {
        est.setEstId(id);
        estudioRepo.save(est);
    }

    @Override
    public void borraEstudio(Long Id) {
        estudioRepo.deleteById(Id);
    }
    
/*Habilidades*/

    @Override
    public List<Habilidad> verHabilidades() {
        return habRepo.findAll();
    }

    @Override
    public void agregarHabilidad(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void editarHabilidad(Long id, Habilidad hab) {
        hab.setHabId(id);
        habRepo.save(hab);
    }

    @Override
    public void borraHabilidad(Long Id) {
        habRepo.deleteById(Id);
    }
    

}
