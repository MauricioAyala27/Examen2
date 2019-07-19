create database celulares;
use celulares;

create table catalogo(
idCatalogo int not null primary key auto_increment,
nombreCatalogo varchar(50)
);

create table proveedor(
idProveedor int not null primary key auto_increment,
nombreProveedor varchar(50),
telefono varchar(25),
correoElectronico varchar(50)
);

create table marca(
idMarca int not null primary key auto_increment,
nombreMarca varchar(50),
descripcion varchar(100),
paisEmsamblaje varchar(50),
idProveedor int,

foreign key (idProveedor) references proveedor(idProveedor) on update cascade on delete cascade
);

create table producto(
idProducto int not null primary key auto_increment,
nombreProducto varchar(50),
idCatalogo int,
idMarca int,
precio double,
descripcion varchar(100),
existencia int,

foreign key (idCatalogo) references catalogo(idCatalogo) on update cascade on delete cascade,
foreign key (idMarca) references marca(idMarca) on update cascade on delete cascade
);

insert into catalogo values(0,'CELULARES');
insert into catalogo values(0,'BATERIAS');
insert into catalogo values(0,'ACCESORIOS EN GENERAL');

insert into proveedor values(0,'TECNOSERVICE','2345-6789','tecnoservices@gmail.com');
insert into proveedor values(0,'RADIOSHACK','2256-0890','radioshack@gmail.com');
insert into proveedor values(0,'RGNIETO','2245-7896','rgnieto@gmail.com');

insert into marca values(0,'HUAWEI','Celular de alta gama','CHINA',1);

select * from catalogo;
select * from proveedor;
select * from marca;
select * from producto;

update producto set existencia=1 where idProducto=1;
