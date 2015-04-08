
CREATE TABLE localidade (
                cod_localidade INT AUTO_INCREMENT NOT NULL,
                cep VARCHAR(35) NOT NULL,
                endereco VARCHAR(55) NOT NULL,
                numero INT NOT NULL,
                bairro VARCHAR(50) NOT NULL,
                cidade VARCHAR(50) NOT NULL,
                uf VARCHAR(15) NOT NULL,
                PRIMARY KEY (cod_localidade)
);


CREATE TABLE loguin (
                cod_usuario INT AUTO_INCREMENT NOT NULL,
                nome VARCHAR(45) NOT NULL,
                telefone VARCHAR(15) NOT NULL,
                celular VARCHAR(15) NOT NULL,
                cpf VARCHAR(15) NOT NULL,
                setor VARCHAR(35) NOT NULL,
                PRIMARY KEY (cod_usuario)
);


CREATE TABLE medico (
                cod_medico INT AUTO_INCREMENT NOT NULL,
                cod_usuario INT NOT NULL,
                cod_localidade INT NOT NULL,
                crm VARCHAR(20) NOT NULL,
                nome VARCHAR(50) NOT NULL,
                telefone VARCHAR(15) NOT NULL,
                celular VARCHAR(15) NOT NULL,
                email VARCHAR(45) NOT NULL,
                especialidade VARCHAR(100) NOT NULL,
                atendimento VARCHAR(35) NOT NULL,
                PRIMARY KEY (cod_medico, cod_usuario, cod_localidade)
);


CREATE TABLE paciente (
                idpaciente INT AUTO_INCREMENT NOT NULL,
                cod_usuario INT NOT NULL,
                cod_localidade INT NOT NULL,
                nome VARCHAR(50) NOT NULL,
                rg INT DEFAULT 15 NOT NULL,
                cpf INT DEFAULT 15 NOT NULL,
                telefone INT DEFAULT 15 NOT NULL,
                celular INT DEFAULT 15 NOT NULL,
                data_nascimento DATE NOT NULL,
                estado_civil VARCHAR(10) NOT NULL,
                tipo_sangue VARCHAR(15) NOT NULL,
                altura INT DEFAULT 15 NOT NULL,
                peso INT DEFAULT 15 NOT NULL,
                PRIMARY KEY (idpaciente, cod_usuario, cod_localidade)
);


CREATE TABLE consuilta (
                cod_consulta INT AUTO_INCREMENT NOT NULL,
                cod_medico INT NOT NULL,
                cod_usuario INT NOT NULL,
                idpaciente INT NOT NULL,
                paciente VARCHAR(45) NOT NULL,
                medico VARCHAR(45) NOT NULL,
                data_consulta DATE NOT NULL,
                horario TIME NOT NULL,
                tipo_consulta VARCHAR(45) NOT NULL,
                sintomas VARCHAR(100) NOT NULL,
                PRIMARY KEY (cod_consulta, cod_medico, cod_usuario, idpaciente)
);


ALTER TABLE medico ADD CONSTRAINT medico_localidade_fk
FOREIGN KEY (cod_localidade)
REFERENCES localidade (cod_localidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE paciente ADD CONSTRAINT paciente_localidade_fk
FOREIGN KEY (cod_localidade)
REFERENCES localidade (cod_localidade)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE medico ADD CONSTRAINT loguin_medico_fk
FOREIGN KEY (cod_usuario)
REFERENCES loguin (cod_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE paciente ADD CONSTRAINT loguin_paciente_fk
FOREIGN KEY (cod_usuario)
REFERENCES loguin (cod_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE consuilta ADD CONSTRAINT medico_consuilta_fk
FOREIGN KEY (cod_medico, cod_usuario)
REFERENCES medico (cod_medico, cod_usuario)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE consuilta ADD CONSTRAINT paciente_consuilta_fk
FOREIGN KEY (cod_usuario, idpaciente)
REFERENCES paciente (cod_usuario, idpaciente)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
