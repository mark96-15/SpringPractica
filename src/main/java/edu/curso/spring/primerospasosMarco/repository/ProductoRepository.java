package edu.curso.spring.primerospasosMarco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.curso.spring.primerospasosMarco.bo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
