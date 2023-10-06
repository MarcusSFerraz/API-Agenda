create table paciente (
	id serial primary key,
	nome varchar(50),
	sobreno varchar(100),
	cpf varchar(15),
	email varchar(100)
);

create table agenda (
	id serial primary key,
	descricao varchar(255),
	data_hora timestamp,
	data_criacao timestamp,
	paciente_id integer,
	constraint fk_agenda_paciente foreign key (paciente_id) references paciente(id)
);

insert into paciente (nome) values ('Paciente');

select * from paciente

insert into agenda (descricao, paciente_id) values ('descricao basica', 0);

select * from agenda