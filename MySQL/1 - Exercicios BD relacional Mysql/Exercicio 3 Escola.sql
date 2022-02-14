create database escola;

use escola;

create table tb_estudantes
(
	id int(5) auto_increment,
    matricula int(5) not null,    
    nome varchar(50) not null,
    idade int(3) not null,
    turma int(3) not null,
    notas double not null,
    primary key(id)   
);

insert into tb_estudantes(matricula, nome, idade, turma, notas) values(01452, "Henrique", 26, 45, 9.9);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Bruna", 19, 45, 6.8);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(32285, "Charles", 24, 45, 5.4);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Julia", 23, 45, 9.2);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Renan", 19, 45, 7.1);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Debora", 19, 45, 6.9);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Jorge", 19, 45, 5.8);
insert into tb_estudantes(matricula, nome, idade, turma, notas) values(15104, "Rebeka", 18, 45, 9.4);

update tb_estudantes set notas = 10 where id = 1;
update tb_estudantes set notas = 8.2 where id = 8;

select * from tb_estudantes;
select * from tb_estudantes where notas <= 6.9;
select * from tb_estudantes where notas > 7.0;

drop table tb_estudantes;


# Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
# informações dos estudantes deste registro dessa escola.
# Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
# relevantes dos estudantes para se trabalhar com o serviço dessa escola.

# Popule esta tabela com até 8 dados;
# Faça um select que retorne o/as estudantes com a nota maior do que 7.
# Faça um select que retorne o/as estudantes com a nota menor do que 7.
# Ao término atualize um dado desta tabela através de uma query de atualização.
# salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
# coloque no seu GitHuB pessoal e compartilhe esta atividade.