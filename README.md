## Docker container DB Mysql
docker run --name mysql-container -e MYSQL_ROOT_HOST=localhost -p 3306:3306 -e MYSQL_ROOT_PASSWORD=secretitonuestro -d mysql:latest

## Docker container Adminer
docker run --name adminer-container -p 8080:8080 --link mysql-container:db -d adminer:latest

# SQL ISERT USER 
INSERT INTO dbausers.`user`
(id_user, address, age, lastnames, names, state, id_rol)
VALUES(1, 'Armenia', 22, 'López', 'Jhon', 1, 1);

# SQL INSERT ROL
INSERT INTO dbausers.rol
(id_rol, rol_name, state)
VALUES(1, 'ADMINISTRADOR', 1);