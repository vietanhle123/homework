use master
go
if exists(select * from sys.databases where name ='don_hang2')
drop database don_hang2
create database don_hang2
use don_hang2 
go
create table product(
id int primary key identity(1,1),
product_name varchar(30),
descriptions varchar(50),
unit char(10),
price float,
num int,
)
go
create table facturer(
id int primary key identity(1,1),
name varchar (20),
adress varchar(30),
phone int
)
go
create table management(
id int primary key identity(1,1),
facturer_id int references facturer(id),
product_id int references product(id),
price float,
num int
)
go
set identity_insert facturer off
set identity_insert product on
insert into product(id,product_name,descriptions,unit,price,num)
values (1,'may tinh t450','may nhap cu','chiec',1000,10),
       (2,'dien thoai nokia5670','may moi','chiec',200,200),
	   (3,'may in samsung 450','may xin nhat the gioi','chiec',100,19),
	   (4,'iphone 13 pro','dien thoai dang hot','chiec',2000,14),
	   (5,'airport pro 11','tai nghe moi ra','chiec',100,30)
go
set identity_insert product off
set identity_insert facturer on
insert into facturer(id,name,adress,phone)
values (1,'asus','usa','00252627480'),
       (2,'apple','france','006534798')
insert into management(facturer_id,product_id,price,num)
values (1,1,1000,10),
       (1,2,200,200),
	   (2,3,100,19),
	   (2,4,2000,14),
	   (1,5,100,30)
go
select * from facturer
select * from product
go

select * from facturer
order by name desc
select * from product
order by price desc
-- info asus
select * from facturer where id = 1 
select * from product where num < 11
-- san pham cua asus
select facturer.id id,product.product_name name,management.price price,management.num
from facturer,product,management
where facturer.id=1
and facturer.id = management.facturer_id
and management.product_id = product.id
and management.price = product.price
and management.num = product.num
go
-- mat hang
select count (id)
from product
-- so cac hang 
select count (id)
from facturer
-- tong san pham cua toan cua hang
select sum(num)
from product
go
-- thay doi
alter table product
alter column price money
go
-- so 0
alter table facturer
alter column phone nvarchar(30)