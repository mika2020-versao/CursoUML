package com.CursoMC.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CursoMC.domain.Categoria;
import com.CursoMC.repositories.CategoriaRepository;

@Service

public class CategoriaService {
	
	@Autowired
	
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
}
	
}
