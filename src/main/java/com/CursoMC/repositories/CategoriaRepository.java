package com.CursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CursoMC.domain.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
