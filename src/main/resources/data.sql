INSERT INTO tb_categoria (name) VALUES ('Eletrônicos');
INSERT INTO tb_categoria (name) VALUES ('Livros');
INSERT INTO tb_categoria (name) VALUES ('Computador');

INSERT INTO tb_produto (nome, descricao, preco, img_url) VALUES
('Senhor dos anéis',
 'Uma obra-prima da literatura de fantasia escrita por J.R.R. Tolkien, que narra a épica jornada de hobbits, humanos, elfos e anões para destruir um anel maligno e salvar a Terra Média.',
 90.50,
 'https://images.unsplash.com/photo-1767219077120-1aa6d2398717?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO tb_produto (nome, descricao, preco, img_url) VALUES
('Smart TV',
 'Smart TV 4K com Wi-Fi e Bluetooth integrados. Acede facilmente a apps de streaming como Netflix e YouTube através do sistema operativo inteligente. Permite espelhamento de ecrã do telemóvel e comando por voz com assistentes virtuais.',
 2190.00,
 'https://images.unsplash.com/photo-1593359677879-a4bb92f829d1?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO tb_produto (nome, descricao, preco, img_url) VALUES
('Macbook Pro',
 'Notebook Apple MacBook Pro (de 13 polegadas, Processador M1 da Apple com CPU 8-core e GPU 8-core, 8 GB RAM, 256 GB) - Cinzento sideral (Recondicionado)',
 1250.00,
 'https://images.unsplash.com/photo-1611186871348-b1ce696e52c9?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO tb_produto (nome, descricao, preco, img_url) VALUES
('PC Gamer',
 'PC Gamer de alta performance com processador de última geração e placa de vídeo dedicada. Equipado com memória RAM veloz, armazenamento SSD para carregamento instantâneo e gabinete com iluminação RGB. Ideal para rodar os jogos mais pesados.',
 1200.00,
 'https://images.unsplash.com/photo-1626218174358-7769486c4b79?q=80&w=1074&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO tb_produto (nome, descricao, preco, img_url) VALUES
('Use a cabeça JAVA',
 'Aprenda a diferença entre uma classe e um objeto. Use suas habilidades em Java para criar um jogo no estilo Batalha Naval. Entre em contato com seu objeto interior. Descubra por que usar referências polimórficas do tipo Objects tem um preço…',
 109.99,
 'https://m.media-amazon.com/images/I/610D1O8WWOL._SL1426_.jpg');
 
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (1, 2);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (2, 1);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (3, 1);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (3, 3);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (4, 3);
INSERT INTO tb_produto_categoria (produto_id, categoria_id) VALUES (5, 2);
