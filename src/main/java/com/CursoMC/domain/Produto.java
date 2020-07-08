package com.CursoMC.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Produto implements Serializable{
	private static final long serialversionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;
	
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA"(name = "PRODUTO_CATEGORIA",
			joinColumns = @JoinColumn(name = "produto_id"),
					inverseJoinColumns = @JoinColumn(name = "categoria_id")
	
	
	
	
}
