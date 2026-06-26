package com.projetointegrador.projetofinal.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.projetofinal.entities.Pedido;
import com.projetointegrador.projetofinal.entities.enums.PedidoStatus;
import com.projetointegrador.projetofinal.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired //para o spring faça a injeção de dependência de forma visivel
	private PedidoRepository repository;
	
	public List<Pedido> findAll(){ 
		return repository.findAll();
		
	}
	public Pedido findById(Long id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get(); 
	}
	
	 public Pedido insert(Pedido obj) {
	        obj.setId(null);
	        obj.setMomento(Instant.now());
	        obj.setPedidoStatus(PedidoStatus.ESPERANDO_PAGAMENTO);
	        return repository.save(obj);
	    }

	    
	    public void delete(Long id) {
	        repository.deleteById(id);
	    }
	
}
