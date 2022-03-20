DROP DATABASE IF EXISTS empleados;

CREATE DATABASE IF NOT EXISTS empleados;

USE empleados;

#uso codigo postal para la llave primaria ya que me parece una mejor opcion como llave unica/
CREATE TABLE IF NOT EXISTS Municipalidad(
	ciudad VARCHAR(128) NOT NULL,
    cod_postal SMALLINT UNSIGNED NOT NULL,
    PRIMARY KEY(cod_postal)
)ENGINE=INNODB;

#agrego el documento y tipo porque realisticamente pueden haber mas de un empleado con mismo nombre y apellido.
#me aseguro que es unico
CREATE TABLE IF NOT EXISTS Empleado(
    nombre VARCHAR(128) NOT NULL,
    apellido VARCHAR(128) NOT NULL,
    telefono VARCHAR(128) NOT NULL,
    mail VARCHAR(128) NOT NULL,
    nro_doc INT UNSIGNED NOT NULL,
    tipo_doc VARCHAR(128) NOT NULL,
    salario_promedio DECIMAL(16,2) UNSIGNED NOT NULL,
    puesto VARCHAR(128) NOT NULL,
    cod_postal SMALLINT UNSIGNED NOT NULL,
    antigüedad SMALLINT UNSIGNED NOT NULL,
    PRIMARY KEY(nro_doc),
    FOREIGN KEY(cod_postal) REFERENCES Municipalidad(cod_postal)
)ENGINE=INNODB;



INSERT INTO Municipalidad(ciudad, cod_postal) 
VALUES('Bahia Blanca', 8000);

INSERT INTO Municipalidad(ciudad, cod_postal) 
VALUES('Mar del Plata', 7600);

INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)
VALUES('Juan', 'Perez','154000000','juanperez360@gmail.com', '30000000', 'DNI', 90000, 'recepcionista', 13, 8000);

INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)
VALUES('Maria', 'Romero','154111111','mariaromero42@gmail.com', '31111111', 'DNI', 75000, 'secretaria', 11, 7600);

INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)
VALUES('Matias', 'Gonzalez','154222222','matiasgonzalez123@gmail.com', '32222222', 'DNI', 30000, 'conserje', 3, 8000);

INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)
VALUES('Andres', 'Vilches','154333333','andresvilches85@gmail.com', '33333333', 'DNI', 69000, 'secretario', 11, 8000);

INSERT INTO Empleado(nombre, apellido, telefono, mail, nro_doc, tipo_doc, salario_promedio, puesto, antigüedad, cod_postal)
VALUES('Susana', 'Perez','154444444','susanaperez12345@gmail.com', '34444444', 'DNI', 120000, 'tesorera', 5, 7600);



#para obtener los valores que se encesitaun utilizo la siguiente consulta

SELECT nombre, apellido, telefono, mail, puesto, ciudad 
	FROM Empleado JOIN Municipalidad ON Empleado.cod_postal = Municipalidad.cod_postal
	WHERE antigüedad>= 10 AND antigüedad<=15 AND salario_promedio>=70000;
