USE TAXIDB;
ALTER TABLE CORRIDA DROP FOREIGN KEY FKCORRIDA716568;
ALTER TABLE CORRIDA DROP FOREIGN KEY FKCORRIDA896915;
ALTER TABLE CORRIDA DROP FOREIGN KEY FKCORRIDA344817;
ALTER TABLE CORRIDA DROP FOREIGN KEY FKCORRIDA929639;
ALTER TABLE VIAGEM DROP FOREIGN KEY FKVIAGEM609971;
ALTER TABLE ENDERECO DROP FOREIGN KEY FKENDERECO839545;
ALTER TABLE ENDERECO DROP FOREIGN KEY FKENDERECO485117;
DROP TABLE IF EXISTS USUARIO;
DROP TABLE IF EXISTS CORRIDA;
DROP TABLE IF EXISTS CLIENTE;
DROP TABLE IF EXISTS VIAGEM;
DROP TABLE IF EXISTS CIDADE;
DROP TABLE IF EXISTS ENDERECO;
DROP TABLE IF EXISTS MOTORISTA;