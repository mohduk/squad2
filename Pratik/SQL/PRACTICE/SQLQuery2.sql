


CREATE TABLE deparment
(
id int identity(1,2),
name varchar(50)
primary key (id)
);

ALTER TABLE student
add marks int ,
add departmentid int



select * from student

where id = 1


insert into student values ('Shailendra', 1, 20, 1)


insert into deparment values ('JAVA')

insert into deparment values ('NET')


insert into student values ( 'Pratik', 34)

insert into student values (null)
insert into student values (null, null)



select * from department
select * from student

select s.name, d.name from student s
join department d
on s.departmentid = d.id 


insert into student values ('Shrutika')