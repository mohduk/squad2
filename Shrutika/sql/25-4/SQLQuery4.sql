Create table Student(
id int IDENTITY (1,1),
name varchar(10)
);


Create table Department(
id int IDENTITY (1,1),
name varchar(10)
);

Insert into Student values('Pratik')
Insert into Student values('Snehal')

Insert into Department values('Java')
Insert into Department values('NET')

ALTER TABLE Department
ADD DepartmentID int;

