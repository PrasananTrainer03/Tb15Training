drop database if exists tb15practice;

create database tb15practice;

use tb15practice;

drop table if exists Employ;

/*  ******************************************************************************************
							     Create Employ Table 
	******************************************************************************************
*/

create table Employ
(
   Empno INT primary key,
   Name varchar(30) NOT NULL,
   Gender ENUM('MALE','FEMALE'),
   Dept varchar(30),
   Desig varchar(30),
   Basic Numeric(9,2)
);

/*  *****************************************************************************************
						Insert Records into Employ Table
	*****************************************************************************************
*/

Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic) 
values(1,'Hasitha','FEMALE','Java','Programmer',94235),
(2,'GangaRaju','MALE','Dotnet','Expert',94234),
(3,'Rajesh','MALE','Java','Programmer',88832),
(4,'Tejaswini','FEMALE','Dotnet','Expert',94234),
(5,'Raju','MALE','Java','Developer',94235),
(6,'Pooja','FEMALE','Dotnet','Programmer',94234);

select * from Employ;