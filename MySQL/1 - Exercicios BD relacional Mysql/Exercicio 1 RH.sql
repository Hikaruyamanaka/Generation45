create database db_rh;

use db_rh;

create table tb_funcionarios
(	
    id int(5) auto_increment,
    nome varchar(50) not null,
    funcao varchar(50) not null,
    salario double not null,
    telefone varchar(20) not null,
    ativo boolean,
    primary key(id)
);

insert into tb_funcionarios(nome, funcao, salario, telefone, ativo) values ("Camila", "Técnica de Enfermagem", 3800.00, '972855716', false);
insert into tb_funcionarios(nome, funcao, salario, telefone, ativo) values ("Henrique", "Gerente",  12800.00, '975475422', true);
insert into tb_funcionarios(nome, funcao, salario, telefone, ativo) values ("Gabriela", "Supervisora", 7800.00, '968521452', true);
insert into tb_funcionarios(nome, funcao, salario, telefone, ativo) values ("Felipe", "Auxiliar de Farmácia", 1800.00, '975425574', true);
insert into tb_funcionarios(nome, funcao, salario, telefone, ativo) values ("Marisa Brasil", "Jovem aprendiz", 1400.00, '945326886', true);

update tb_funcionarios set nome = "Camila Cervantes", ativo = true where id = 1;

select * from tb_funcionarios;
select * from tb_funcionarios where salario <= 2000;
select * from tb_funcionarios where salario > 2000;


# Outra forma de mostrar os resultados...
# SELECT nome, funcao, salario, telefone, ativo FROM tb_funcionarios WHERE salario between 0 and  2000;
# SELECT nome, funcao, salario, telefone, ativo FROM tb_funcionarios WHERE salario between 2000 and  150000;

# ATUALIZAR
# update tb_funcionarios set nome = "Camila Cervantes", ativo = true
#	where id = 1;

# delete from tb_funcionarios where id = 1;

# drop table tb_funcionarios;

# select * from tb_funcionarios where id (pode ter sinais como igual pra mostrar aquela linha,
# ou sinal de < ou > ou (<> significa diferente) ou >= que 2 para mostrar os valores)

# select nome, ativo from tb_funcionarios where id = 2

# drop table tb_funcionarios

# Crie um banco de dados para um serviço de
 # RH de uma empresa, onde o sistema
# trabalhará com as informações dos funcionaries 
# desta empresa.

# Crie uma tabela de funcionaries e utilizando a
#  habilidade de abstração e determine 5
# atributos relevantes dos funcionaries para se
 # trabalhar com o serviço deste RH.
 
# Popule esta tabela com até 5 dados;
# Faça um select que retorne os funcionaries com o
 # salário maior do que 2000.
 
# Faça um select que retorne os funcionaries com o
 # salário menor do que 2000.
# Ao término atualize um dado desta tabela através
 # de uma query de atualização.// 