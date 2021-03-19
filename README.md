### MyBatis DB 설정
```sql
create user 'pos'@'%' identified by 'pos1234';
GRANT ALL PRIVILEGES ON *.* TO 'pos'@'%';
create database pos;

create table product(
	id int auto_increment primary key,
    name varchar(50),
    code varchar(50)
);


create table paname(
	id int auto_increment primary key,
    productId int,
    username varchar(30)
);
```