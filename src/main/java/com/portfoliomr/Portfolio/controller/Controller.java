package com.portfoliomr.Portfolio.controller;

import com.portfoliomr.Portfolio.Dto.PortfolioDto;
import com.portfoliomr.Portfolio.model.Estudio;
import com.portfoliomr.Portfolio.model.Experiencia;
import com.portfoliomr.Portfolio.model.Habilidad;
import com.portfoliomr.Portfolio.model.Persona;
import com.portfoliomr.Portfolio.model.Proyecto;
import com.portfoliomr.Portfolio.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {

    @Autowired
    private IPersonaService persoServ;
    
/* Porfolio */
    @CrossOrigin
    @GetMapping ("/portfolio")
    @ResponseBody
    public PortfolioDto delvolverPortfolio () {
        List<Persona> pers = persoServ.verPersonas();
        List<Experiencia> exp = persoServ.verExperiencias();
        List<Estudio> est = persoServ.verEstudios();
        List<Habilidad> hab = persoServ.verHabilidades();
        List<Proyecto> proy = persoServ.verProyectos();
        
        PortfolioDto portDTO = new PortfolioDto();
        portDTO.setPer(pers);
        portDTO.setExp(exp);
        portDTO.setEstu(est);
        portDTO.setHab(hab);
        portDTO.setProy(proy);
        
        return portDTO;
        
    }
    
/* Persona */
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @PutMapping ("/editar/persona/{id}")
    public void editarPersona (
            @PathVariable("id") Long id,
            @RequestBody Persona pers) {
        persoServ.editarPersona(id, pers);
    }
    
/* Experiencias */
    
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return persoServ.verExperiencias();
    }

    @PostMapping ("/nuevo/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        persoServ.agregarExperiencia(exp);
    }
    
    @PutMapping ("/editar/experiencia/{id}")
    public void editarExperiencia(
            @PathVariable("id") Long expId,
            @RequestBody Experiencia exp) {
        persoServ.editarExperiencia(expId, exp);
    }
    
    @DeleteMapping ("/borrar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable("id") Long expId) {
        persoServ.borrarExpereincia(expId);
    }    

/* Proyectos */

    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return persoServ.verProyectos();
    }

    @PostMapping ("/nuevo/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proy) {
        persoServ.agregarProyecto(proy);
    }
    
    @PutMapping ("/editar/proyecto/{id}")
    public void editarProyecto(
            @PathVariable("id") Long proyId,
            @RequestBody Proyecto proy) {
        persoServ.editarProyecto(proyId, proy);
    }
    
    @DeleteMapping ("/borrar/proyecto/{id}")
    public void borrarProyecto(@PathVariable("id") Long proyId) {
        persoServ.borrarProyecto(proyId);
    }
    
    
/* Estudios */

    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios() {
        return persoServ.verEstudios();
    }
    
    @CrossOrigin
    @PostMapping ("/nuevo/estudio")
    public void agregarEstudio(@RequestBody Estudio est) {
        persoServ.agregarEstudio(est);
    }
    
    @PutMapping ("/editar/estudio/{id}")
    public void editarEstudio(
            @PathVariable("id") Long estId,
            @RequestBody Estudio est) {
        persoServ.editarEstudio(estId, est);
    }
    
    @DeleteMapping ("/borrar/estudio/{id}")
    public void borrarEstudio(@PathVariable("id") Long estId) {
        persoServ.borraEstudio(estId);
    }

/* Habilidades */

    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return persoServ.verHabilidades();
    }
    
    @CrossOrigin
    @PostMapping ("/nuevo/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad hab) {
        persoServ.agregarHabilidad(hab);
    }
    
    @PutMapping ("/editar/habilidad/{id}")
    public void editarHabilidad(
            @PathVariable("id") Long habId,
            @RequestBody Habilidad hab) {
        persoServ.editarHabilidad(habId, hab);
    }
    
    @DeleteMapping ("/borrar/habilidad/{id}")
    public void borrarHabilidad(@PathVariable("id") Long habId) {
        persoServ.borraHabilidad(habId);
    }
    
    
/*prueba*/
    @GetMapping ("/hola")
    public String decirHola(){
        return "Holaaa funciono";
    }
    
}
