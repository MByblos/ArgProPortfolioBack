
package com.portfoliomr.Portfolio.repository;

import com.portfoliomr.Portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface estudioRepository extends JpaRepository <Estudio, Long>{

    
}