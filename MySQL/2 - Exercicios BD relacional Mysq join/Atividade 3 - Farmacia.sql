create database db_farmacia_do_bem;
use db_farmacia_do_bem;

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
receita boolean,
fabricante varchar(20),
id_categoria int not null,

primary key (id),
foreign key  (id_categoria) references tb_categorias(id)
);


insert into tb_categorias(nome, responsavel) 
values ("Higiene", "Carlão");

insert into tb_categorias(nome, responsavel) 
values ("Medicamentos", "Joana");

insert into tb_categorias(nome, responsavel) 
values ("Beleza", "Marina");

insert into tb_categorias(nome, responsavel) 
values ("Suplementos", "Arnold");

insert into tb_categorias(nome, responsavel) 
values ("Alimentos", "Marcel");



insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Aspirina", 2.50, false, "Bayer", 2);

insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Whey", 40.50, false, "Integral Medica", 4);

insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Rivotril", 20.50, true, "Pfizer", 2);

insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Esmalte", 4.50, false, "Anita", 3);

insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Leite em pó", 25.50, true, "Nestle", 5);

insert into produto(nome, valor, receita, fabricante, id_categoria)
values("Papel higienico", 10.50, false, "Personal", 1);


SELECT * FROM produto WHERE Nome LIKE 'b%';
SELECT * FROM produto WHERE valor BETWEEN 3 AND 60;
SELECT * FROM produto WHERE valor >50;


select a.nome, b.nome
FROM tb_categorias as a
INNER JOIN produto as b
on a.id = b.id_categoria;


select * from tb_categorias;
select * from produto;