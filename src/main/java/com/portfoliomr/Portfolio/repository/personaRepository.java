
package com.portfoliomr.Portfolio.repository;

import com.portfoliomr.Portfolio.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface personaRepository extends JpaRepository <Persona, Long>{
    Optional<Persona> findByNombre(String nombre);

    
}
