
package com.portfoliomr.Portfolio.Dto;

import com.portfoliomr.Portfolio.model.Estudio;
import com.portfoliomr.Portfolio.model.Experiencia;
import com.portfoliomr.Portfolio.model.Habilidad;
import com.portfoliomr.Portfolio.model.Persona;
import com.portfoliomr.Portfolio.model.Proyecto;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PortfolioDto implements Serializable {
    private List<Persona> per;
    private List<Habilidad> hab;
    private List<Experiencia> exp;
    private List<Estudio> estu;
    private List<Proyecto> proy;
    
    public PortfolioDto() {
    }
    
    public PortfolioDto(List<Persona> per, List<Habilidad> hab, List<Experiencia> exp, List<Estudio> estu, List<Proyecto> proy) {
        this.per = per;
        this.hab = hab;
        this.exp = exp;
        this.estu = estu;
        this.proy = proy;
    }

    
}
