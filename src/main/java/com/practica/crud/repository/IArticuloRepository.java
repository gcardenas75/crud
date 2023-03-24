package com.practica.crud.repository;

import com.practica.crud.models.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticuloRepository extends JpaRepository <Articulo, Long> {
}
