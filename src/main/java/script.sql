

CREATE DATABASE poligonos;

USE poligonos;

CREATE TABLE almacen(
    id INT AUTO_INCREMENT,
    calle VARCHAR(100),
    numero VARCHAR(100),
	distrito VARCHAR(100),
    cp INT(100),
    PRIMARY KEY(id)
);




INSERT INTO almacen (id, calle, numero, distrito, cp) VALUES(1, '13 rosas', '87', 'urgel',24015),
(2, '14 rosas', '8s', 'alcorcon',555),(3, '15 rosas', '54', 'getafe',24015),
(4, '16 rosas', '8s', 'leganes',555),(5, '17 rosas', '54jhg', 'madrid',280254);


