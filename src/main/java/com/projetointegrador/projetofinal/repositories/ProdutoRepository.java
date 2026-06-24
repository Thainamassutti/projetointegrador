package com.projetointegrador.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.projetofinal.entities.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
