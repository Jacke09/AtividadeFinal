
CREATE TABLE Produto(
   idProduto SERIAL primary key,
   nome VARCHAR(50) NOT NULL,
   valor int NOT NULL,
   categoria VARCHAR(50) NOT NULL
);

DROP TABLE Produto

select * from produto;

INSERT INTO Produto VALUES (1, 'Calça Jeans', 100, 'Roupa')
INSERT INTO Produto VALUES (2, 'SAIA', 85, 'Roupa')
INSERT INTO Produto VALUES (3, '')
