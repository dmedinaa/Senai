CREATE DATABASE IF NOT EXISTS monitoramento;

use monitoramento;

CREATE TABLE IF NOT EXISTS acesso (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    acao VARCHAR(255),
    data_acesso TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE IF NOT EXISTS usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255),
    senha VARCHAR(255),
    nome VARCHAR(255),
    entrada VARCHAR(255)
);

DELIMITER //

CREATE TRIGGER after_insert_usuario
AFTER INSERT ON usuario
FOR EACH ROW 
BEGIN
        INSERT INTO acesso (id_usuario, acao)
        VALUES (NEW.id, "Login");
END;

DELIMITER ;


INSERT INTO usuario (email, senha, nome, entrada)
VALUES ('Neylor', "neylor@gmail.com", '123', "Sim");

SELECT * FROM usu  ario

SELECT * FROM acesso