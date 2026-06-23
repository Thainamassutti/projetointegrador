package com.projetointegrador.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.projetofinal.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
