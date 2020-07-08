package com.CursoMC.domain;

import java.io.Serializable;

public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Interger id;
	private String nome;
	
	public Categoria () {
		
	}

	public Categoria(Interger id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Interger getId() {
		return id;
	}

	public void setId(Interger id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
