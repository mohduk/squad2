CREATE TABLE Student(
id int identity (1,1), name varchar(10));


CREATE TABLE Department(
id int, name varchar(10));


insert into student values(  'Pratik')

insert into student values(  'Shrutika')

insert into student values(  'Shubham')

insert into student values(	'Ashish')

insert into student values ('Anil')

insert into student values ('Sunil')

Alter table student 
add  age int ;


update student 
set age =26
where name = 'Pratik';

update student 
set age=24
where name='Shrutika';

Alter table student
drop column DepartmentID;

insert into Department values ( 1, 'IT')





