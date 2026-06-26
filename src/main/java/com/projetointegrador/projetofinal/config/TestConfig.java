package com.projetointegrador.projetofinal.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetointegrador.projetofinal.entities.Categoria;
import com.projetointegrador.projetofinal.entities.ItemPedido;
import com.projetointegrador.projetofinal.entities.Pagamento;
import com.projetointegrador.projetofinal.entities.Pedido;
import com.projetointegrador.projetofinal.entities.Produto;
import com.projetointegrador.projetofinal.entities.User;
import com.projetointegrador.projetofinal.entities.enums.PedidoStatus;
import com.projetointegrador.projetofinal.repositories.CategoriaRepository;
import com.projetointegrador.projetofinal.repositories.ItemPedidoRepository;
import com.projetointegrador.projetofinal.repositories.PedidoRepository;
import com.projetointegrador.projetofinal.repositories.ProdutoRepository;
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
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		Categoria cat3 = new Categoria(null, "Computador"); 
		
		Produto p1 = new Produto(null, "Senhor dos anéis", "Uma obra-prima da literatura de fantasia escrita por J.R.R. Tolkien, que narra a épica jornada de hobbits, humanos, elfos e anões para destruir um anel maligno e salvar a Terra Média.", 90.5, "https://images.unsplash.com/photo-1767219077120-1aa6d2398717?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
		Produto p2 = new Produto(null, "Smart TV", "Smart TV 4K com Wi-Fi e Bluetooth integrados. Acede facilmente a apps de streaming como Netflix e YouTube através do sistema operativo inteligente. Permite espelhamento de ecrã do telemóvel e comando por voz com assistentes virtuais.", 2190.0, "https://images.unsplash.com/photo-1593359677879-a4bb92f829d1?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
		Produto p3 = new Produto(null, "Macbook Pro", "Notebook Apple MacBook Pro (de 13 polegadas, Processador M1 da Apple com CPU 8‑core e GPU 8‑core, 8 GB RAM, 256 GB) - Cinzento sideral (Recondicionado)", 1250.0, "https://images.unsplash.com/photo-1611186871348-b1ce696e52c9?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
		Produto p4 = new Produto(null, "PC Gamer", "PC Gamer de alta performance com processador de última geração e placa de vídeo dedicada. Equipado com memória RAM veloz, armazenamento SSD para carregamento instantâneo e gabinete com iluminação RGB. Ideal para rodar os jogos mais pesados.", 1200.0, "https://images.unsplash.com/photo-1626218174358-7769486c4b79?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
		Produto p5 = new Produto(null, "Use a cabeça JAVA", "Aprenda a diferença entre uma classe e um objeto.\r\n"
				+ "\r\n"
				+ "Use suas habilidades em Java para criar um jogo no estilo Batalha Naval. Entre em contato com seu objeto interior.\r\n"
				+ "\r\n"
				+ "Descubra por que usar referências polimórficas do tipo Objects tem um preço…", 109.99, "https://m.media-amazon.com/images/I/610D1O8WWOL._SL1426_.jpg"); 

		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
		p1.getCategorias().add(cat2); //associando um produto a uma categoria
		p2.getCategorias().add(cat1);
		p2.getCategorias().add(cat3);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat3);
		p5.getCategorias().add(cat2);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", "Rua dos Bobos");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", "Jardim Montreal"); 

		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"),PedidoStatus.PAGO, u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"),PedidoStatus.ESPERANDO_PAGAMENTO, u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"),PedidoStatus.ESPERANDO_PAGAMENTO, u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		pedidoRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		ItemPedido oi1 = new ItemPedido(o1, p1, 2, p1.getPreco());
		ItemPedido oi2 = new ItemPedido(o1, p3, 1, p3.getPreco());
		ItemPedido oi3 = new ItemPedido(o2, p3, 2, p3.getPreco());
		ItemPedido oi4 = new ItemPedido(o3, p5, 2, p5.getPreco());
		
		itemPedidoRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
	
		Pagamento pay1 = new Pagamento(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPagamento(pay1);
		
		pedidoRepository.save(o1);
		
	
	}
	
	
}
