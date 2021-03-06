create database if no exists TaxiDB;
use taxidb;
CREATE TABLE USUARIO (CODUSUARIO int(10) NOT NULL AUTO_INCREMENT, USUARIO varchar(255) NOT NULL UNIQUE, SENHA varchar(255) NOT NULL, ATIVO char(1) DEFAULT 'S' NOT NULL, PRIMARY KEY (CODUSUARIO));
CREATE TABLE CORRIDA (CODCORRIDA int(10) NOT NULL AUTO_INCREMENT, CODCLIENTE int(10) NOT NULL, CODENDERECO_ORIGEM int(10) NOT NULL, CODENDERECO_DESTINO int(10) NOT NULL, CODMOTORISTA int(10), VALOR double, PRIMARY KEY (CODCORRIDA));
CREATE TABLE CLIENTE (CODCLIENTE int(10) NOT NULL AUTO_INCREMENT, TELEFONE1 varchar(15) NOT NULL, TELEFONE2 varchar(15) NOT NULL, NOME varchar(255) NOT NULL UNIQUE, PASSAGEIROS int(10) NOT NULL, PRIMARY KEY (CODCLIENTE));
CREATE TABLE VIAGEM (CODVIAGEM int(10) NOT NULL AUTO_INCREMENT, DISTANCIA double NOT NULL, VALOR double NOT NULL, CODCIDADE int(10) NOT NULL, PRIMARY KEY (CODVIAGEM));
CREATE TABLE CIDADE (CODCIDADE int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODCIDADE));
CREATE TABLE ENDERECO (CODENDERECO int(10) NOT NULL AUTO_INCREMENT, ENDERECO varchar(255) NOT NULL, BAIRRO varchar(255) NOT NULL, NUMERO int(10) NOT NULL, CODCIDADE int(10) NOT NULL, CODMOTORISTA int(10), PRIMARY KEY (CODENDERECO));
CREATE TABLE MOTORISTA (CODMOTORISTA int(10) NOT NULL AUTO_INCREMENT, NOME varchar(255) NOT NULL UNIQUE, PLACA varchar(7) NOT NULL, TELPESSOAL varchar(15) NOT NULL, TELTAXI varchar(15) NOT NULL, DATAINICIO date NOT NULL, DATAFIM date, PRIMARY KEY (CODMOTORISTA));
ALTER TABLE CORRIDA ADD INDEX FKCORRIDA716568 (CODENDERECO_DESTINO), ADD CONSTRAINT FKCORRIDA716568 FOREIGN KEY (CODENDERECO_DESTINO) REFERENCES ENDERECO (CODENDERECO);
ALTER TABLE CORRIDA ADD INDEX FKCORRIDA896915 (CODENDERECO_ORIGEM), ADD CONSTRAINT FKCORRIDA896915 FOREIGN KEY (CODENDERECO_ORIGEM) REFERENCES ENDERECO (CODENDERECO);
ALTER TABLE CORRIDA ADD INDEX FKCORRIDA344817 (CODMOTORISTA), ADD CONSTRAINT FKCORRIDA344817 FOREIGN KEY (CODMOTORISTA) REFERENCES MOTORISTA (CODMOTORISTA);
ALTER TABLE CORRIDA ADD INDEX FKCORRIDA929639 (CODCLIENTE), ADD CONSTRAINT FKCORRIDA929639 FOREIGN KEY (CODCLIENTE) REFERENCES CLIENTE (CODCLIENTE);
ALTER TABLE VIAGEM ADD INDEX FKVIAGEM609971 (CODCIDADE), ADD CONSTRAINT FKVIAGEM609971 FOREIGN KEY (CODCIDADE) REFERENCES CIDADE (CODCIDADE);
ALTER TABLE ENDERECO ADD INDEX FKENDERECO839545 (CODMOTORISTA), ADD CONSTRAINT FKENDERECO839545 FOREIGN KEY (CODMOTORISTA) REFERENCES MOTORISTA (CODMOTORISTA);
ALTER TABLE ENDERECO ADD INDEX FKENDERECO485117 (CODCIDADE), ADD CONSTRAINT FKENDERECO485117 FOREIGN KEY (CODCIDADE) REFERENCES CIDADE (CODCIDADE);

