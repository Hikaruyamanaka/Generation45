create database Loja;

use Loja;

create table tb_produtos
(
	id int(4) auto_increment,
	produto varchar(20) not null,
	tamanho char(2) not null,
	cor varchar(20) not null,
	valor double,
    ativo boolean,
    primary key(id)
);
    
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Vestido", 'M', "Vermelho", 780.00 , False);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Salto", '38', "Preto", 450.00, True);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Jaqueta", 'P', "Preta", 890.00, True);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Blusa", 'G', "Bege", 320.00, True);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Saia Jeans", 'M', "Azul Escuro", 210.00, False);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Sapato", '36', "Branco", 560.00, False);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Camiseta", 'M', "Verde", 175.00, True);
insert into tb_produtos(produto, tamanho, cor, valor, ativo) values("Calça Jeans", '38', "Azul Claro", 280.00, False);

update tb_produtos set valor = 710.00 where id = 1;
update tb_produtos set ativo = True where id = 1;

select * from tb_produtos;
select * from tb_produtos where valor <= 499.99;
select * from tb_produtos where valor > 500.00;

drop table tb_produtos;


# Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
# informações dos produtos deste ecommerce.
# Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
# relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
# Popule esta tabela com até 8 dados;
# Faça um select que retorne os produtos com o valor maior do que 500.
# Faça um select que retorne os produtos com o valor menor do que 500.
# Ao término atualize um dado desta tabela através de uma query de atualização.
# salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
# coloque no seu GitHuB pessoal e compartilhe esta atividade.