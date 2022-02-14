create database db_cidade_das_carnes;
use db_cidade_das_carnes;


create table tb_categorias (
id int auto_increment,
nome varchar(20),
responsavel varchar(20),
primary key (id)
);

create table produto(
id int auto_increment,
nome varchar(20),
valor double,
fabricante varchar(20),
id_acougue int not null,

primary key (id),
foreign key  (id_acougue) references tb_categorias(id)
);

insert into tb_categorias(nome, responsavel) 
values ("Carnes", "Joao");

insert into tb_categorias(nome, responsavel) 
values ("Enlatados", "Marcos");

insert into tb_categorias(nome, responsavel) 
values ("Bebidas", "Pedro");

select * from tb_categorias;

insert into produto(nome, valor, fabricante, id_acougue)
values("Carne", 45.50, "indefinido", 1); 

insert into produto(nome, valor, fabricante, id_acougue)
values("Atum Enlatado", 5.50, "Gomes da costa", 2);

insert into produto(nome, valor, fabricante, id_acougue)
values("Vodka", 47.50, "Smirnoff", 3);

insert into produto(nome, valor, fabricante, id_acougue)
values("Linguica", 18.50, "indefinido", 1);

insert into produto(nome, valor, fabricante, id_acougue)
values("Frango", 17.50, "indefinido", 1);

insert into produto(nome, valor, fabricante, id_acougue)
values("Whisky", 80.50, "indefinido", 3);

insert into produto(nome, valor, fabricante, id_acougue)
values("Milho", 7.50, "Cocoricó", 2);

SELECT * FROM produto where id = 1;
SELECT * FROM produto WHERE Nome LIKE 'C%';
SELECT * FROM produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM produto WHERE valor >50;


select a.nome, b.valor
FROM tb_categorias as a
INNER JOIN produto as b
on a.id = b.id_acougue;