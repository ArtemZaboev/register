create database register;
create table if not exists individual(
id  serial primary key not null,
name varchar (255) not null,
surname varchar (255) not null,
patronymic varchar (255),
dateOfBirth varchar (15),
inn varchar (12)
);