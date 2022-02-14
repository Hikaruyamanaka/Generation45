create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;


create table tb_curso(
id int auto_increment,
formacao varchar(20),
professor varchar(20),
primary key (id)
);

create table tb_aula(
id int auto_increment,
aula varchar(20),
duracao double, 
valor double,
id_estudo int not null,

primary key (id),
foreign key  (id_estudo) references tb_curso(id)
);

insert into tb_curso(professor, formacao) 
values ("Joao", "Matematico");

insert into tb_curso(professor, formacao) 
values ("Marcelo", "Quimico");

insert into tb_curso(professor, formacao) 
values ("Saulo", "Literatura");

select * from tb_curso;

insert into tb_aula(aula, duracao, valor, id_estudo)
values("Aula de matematica", 60, 80.00, 1); 

insert into tb_aula(aula, duracao, valor, id_estudo)
values("Aula de quimica", 55, 40.00, 2);

insert into tb_aula(aula, duracao , valor, id_estudo)
values("AUla de portugues", 55, 15.00, 3);

SELECT * FROM tb_aula WHERE aula LIKE 'J%';
SELECT * FROM tb_aula WHERE valor BETWEEN 3 AND 60;
SELECT * FROM tb_aula WHERE valor >50;

SELECT a.professor, b.aula
FROM tb_curso AS a
INNER JOIN tb_aula AS b 
ON a.id = b.id_estudo;

drop table tb_aula;
drop database db_cursoDaMinhaVida ; 