# SQL ISERT USER 
INSERT INTO dbausers.`user`
(id_user, address, age, lastnames, names, state, id_rol)
VALUES(1, 'Armenia', 22, 'López', 'Jhon', 1, 1);

# SQL INSERT ROL
INSERT INTO dbausers.rol
(id_rol, rol_name, state)
VALUES(1, 'ADMINISTRADOR', 1);