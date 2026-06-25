package com.projetointegrador.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.projetofinal.entities.ItemPedido;
import com.projetointegrador.projetofinal.entities.pk.ItemPedidoPK;



public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {

}
