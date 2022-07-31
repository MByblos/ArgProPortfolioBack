package com.portfoliomr.Portfolio.security.repository;

import com.portfoliomr.Portfolio.security.enus.RolNombre;
import com.portfoliomr.Portfolio.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
