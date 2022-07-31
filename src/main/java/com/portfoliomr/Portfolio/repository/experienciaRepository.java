
package com.portfoliomr.Portfolio.repository;

import com.portfoliomr.Portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface experienciaRepository extends JpaRepository <Experiencia, Long>{


    
}

