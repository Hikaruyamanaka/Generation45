create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

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
id_construir int not null,

primary key (id),
foreign key  (id_construir) references tb_categorias(id)
);

insert into tb_categorias(nome, responsavel) 
values ("Cimento", "Joao");

insert into tb_categorias(nome, responsavel) 
values ("Torneiras", "Marcos");

insert into tb_categorias(nome, responsavel) 
values ("Blocos", "Pedro");

select * from tb_categorias;

insert into produto(nome, valor, fabricante,id_construir)
values("Torneira de ferro", 80.50, "Tigre", 2); 

insert into produto(nome, valor, fabricante, id_construir)
values("Torneira de plástico", 5.50, "Tigre", 2);

insert into produto(nome, valor, fabricante, id_construir)
values("Bloco M", 18.00, "Construtora A", 3);

insert into produto(nome, valor, fabricante, id_construir)
values("Bloco G", 18.50, "Construtora B", 3);

insert into produto(nome, valor, fabricante,id_construir)
values("Bloco P", 17.50, "Construtora C", 3);

insert into produto(nome, valor, fabricante, id_construir)
values("Cimento tipo A", 40.50, "Concreteira A", 1);

insert into produto(nome, valor, fabricante, id_construir)
values("Cimento tipo B", 35.50, "Concreteira B", 1);

SELECT * FROM produto where id = 1;
SELECT * FROM produto WHERE Nome LIKE 'C%';
SELECT * FROM produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM produto WHERE valor >50;

select a.nome, b.valor
FROM tb_categorias as a
INNER JOIN produto as b
on a.id = b.id_construir;

-- drop table produto; 
