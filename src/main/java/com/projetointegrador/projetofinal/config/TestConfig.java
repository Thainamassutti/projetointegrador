package com.projetointegrador.projetofinal.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetointegrador.projetofinal.entities.Categoria;
import com.projetointegrador.projetofinal.entities.Pedido;
import com.projetointegrador.projetofinal.entities.User;
import com.projetointegrador.projetofinal.entities.enums.PedidoStatus;
import com.projetointegrador.projetofinal.repositories.CategoriaRepository;
import com.projetointegrador.projetofinal.repositories.PedidoRepository;
import com.projetointegrador.projetofinal.repositories.UserRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Electronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		Categoria cat3 = new Categoria(null, "Computador"); 

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"),PedidoStatus.PAGO, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"),PedidoStatus.ESPERANDO_PAGAMENTO, u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"),PedidoStatus.ESPERANDO_PAGAMENTO, u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		pedidoRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
