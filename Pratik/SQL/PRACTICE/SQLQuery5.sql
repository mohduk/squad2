

select * from student order by name
select * from student order by name desc


alter table department
add foreign key fk_student_department_id references student(id)

select age, sum(1),  from student
group by age
having age > 20



 
 select * from department
  
 select * from student

 insert into department values (1,'JAVA')
  insert into department values (2,'NET')

update student set departmentid = 20 where id = 0
 
 select * from department


 alter table student 
 add  foreign key  fk_student_department_id department(id)


