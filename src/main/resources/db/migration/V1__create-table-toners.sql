-- Script para criar a tabela "toners" no MySQL

CREATE TABLE toners (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(20),
    descricao VARCHAR(100),
    nota VARCHAR(20),
    data_recebimento DATE,
    tipo VARCHAR(50)
);