package com.projetointegrador.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.projetofinal.entities.Categoria;
import com.projetointegrador.projetofinal.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //para o spring faça a injeção de dependência de forma visivel
	private CategoriaRepository repository;
	
	public List<Categoria> findAll(){ //operação na camada de serviço que repassa a informação para o repository
		return repository.findAll();
		
	}
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.get(); // vai retornar objeto do tipo user que estiver dentro do Optional
	}
}
