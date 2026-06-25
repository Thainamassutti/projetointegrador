package com.projetointegrador.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.projetofinal.entities.User;
import com.projetointegrador.projetofinal.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired //para o spring faça a injeção de dependência de forma visivel
	private UserRepository repository;
	
	public List<User> findAll(){ //operação na camada de serviço que repassa a informação para o repository
		return repository.findAll();
		
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); // vai retornar objeto do tipo user que estiver dentro do Optional
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
