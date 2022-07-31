package com.portfoliomr.Portfolio.repository;

import com.portfoliomr.Portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface habilidadRepository extends JpaRepository <Habilidad, Long>{
    
}
