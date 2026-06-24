package com.projetointegrador.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.projetofinal.entities.Produto;
import com.projetointegrador.projetofinal.entities.User;
import com.projetointegrador.projetofinal.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired //para o spring faça a injeção de dependência de forma visivel
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){ //operação na camada de serviço que repassa a informação para o repository
		return repository.findAll();
		
	}
	public Produto findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.get(); // vai retornar objeto do tipo user que estiver dentro do Optional
	}
}
