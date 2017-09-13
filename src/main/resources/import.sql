drop table user if exists;

create table user (
  id int primary key auto_increment,
  username varchar(8),
  password varchar(32)
);

insert into user (id, username, password) values(1,'hu','123456');
insert into user (id, username, password) values(2,'maktub','234567');