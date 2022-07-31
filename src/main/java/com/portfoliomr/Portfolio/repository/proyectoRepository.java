
package com.portfoliomr.Portfolio.repository;

import com.portfoliomr.Portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface proyectoRepository extends JpaRepository <Proyecto, Long>{

}
