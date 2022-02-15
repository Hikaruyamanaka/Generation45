create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id int (1) auto_increment,
nome varchar(10),
idade int(5),
profissao varchar(15),
nacionalidade varchar(15),
arma varchar(15),
primary key (id)
);

create table tb_personagens(
id_personagens int (1) auto_increment,
forca int,
destreza int,
agilidade int,
inteligencia int,
defesa int,
fk_classe int not null,
primary key (id_personagens),
foreign key  (fk_classe) references tb_classe(id)
);


ALTER TABLE tb_classe ADD jogo_id int;


select * from tb_personagens;
select * from tb_classe;


insert into tb_classe(nome, idade, profissao, nacionalidade, arma) 
values ("Reginaldo", 20, "padeiro", "Franca", "arco");

insert into tb_classe(nome, idade, profissao, nacionalidade, arma) 
values ("Marquinhos", 25, "carpinteiro", "Nova Zelandia", "Espada");

insert into tb_classe(nome, idade, profissao, nacionalidade, arma) 
values ("Joaquina", 18, "Lenhadora", "Brasil", "Machado");

insert into tb_classe(nome, idade, profissao, nacionalidade, arma) 
values ("Filomena", 30, "Mineradora", "Dubai", "Picareta");

insert into tb_classe(nome, idade, profissao, nacionalidade, arma) 
values ("Jean", 22, "Ladino", "SuiÃ§a", "adaga");

insert into tb_personagens(forca, destreza, agilidade, inteligencia, defesa, fk_classe) values (1800,1900,2500,2000,1700, 5);
insert into tb_personagens(forca, destreza, agilidade, inteligencia, defesa, fk_classe) values (1000,1900,3000,1000,1900, 4);
insert into tb_personagens(forca, destreza, agilidade, inteligencia, defesa, fk_classe) values (1500,1700,3000,2000,2500, 3);
insert into tb_personagens(forca, destreza, agilidade, inteligencia, defesa, fk_classe) values (3000,1400,3900,1500,1800, 2);
insert into tb_personagens(forca, destreza, agilidade, inteligencia, defesa, fk_classe) values (2000,1700,3500,2000,2600, 1);


SELECT * FROM tb_classe WHERE Nome LIKE 'F%';
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE forca BETWEEN 2000 AND 10000;
select *from tb_personagens ;


select a.id, b.id_personagens
FROM tb_classe as a
INNER JOIN tb_personagens as b
on a.id = b.id_personagens;

drop table tb_personagens;
drop table classe;
drop database  db_generation_game_online;