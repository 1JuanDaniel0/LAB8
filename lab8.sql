CREATE DATABASE IF NOT EXISTS lab8;
USE lab8;

CREATE TABLE Evento (
                        id INT NOT NULL AUTO_INCREMENT,
                        nombreEvento VARCHAR(100) NOT NULL,
                        ciudad VARCHAR(50) NOT NULL,
                        fechaEvento DATE NOT NULL,
                        condicionClima TEXT NOT NULL,
                        tempMax DOUBLE NOT NULL,
                        tempMin DOUBLE NOT NULL,
                        PRIMARY KEY (id)
);