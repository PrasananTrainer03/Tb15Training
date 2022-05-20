-- String Functions 

-- INSTR() : Displays the first occurrence of the given char. 

select INSTR('Lakshmi Priya','i'); 

select Ename,INSTR(ENAME,'A') From Emp;

-- LENGTH(): Displays the length of string 

select length('Chetan');

select Ename, Length(Ename) from Emp;

-- Reverse() : Used to display string in revese order 

select Reverse('Harshitha');

select Ename, Reverse(Ename) from Emp;

-- LEFT() : Displays no.of left-side characters 

select Left('Harshitha',4);

select Ename, left(Ename,4) from Emp;

-- RIGHT() : Displays no.of right-side characters 

select right('Harshitha',4);

select Ename, Right(Ename,4) from Emp;

-- LOWER() : Displays in Lower Case

select lower('Harshitha');

select upper('Harshita');

select Ename, Lower(Ename), Upper(Ename) from Emp;

-- UPPER() : Dispalys in Upper Case

-- Replace() : used to replace old value with new value in all occurrences 

select replace('Java Training','Java','Sql'); 

-- Concat : Used to concatenate multiple strings 

select concat('Hemanth',' Kumar', ' Reddy');

-- Substr() :  Used to display the part of the string 

select substr('Welcome to Mysql Programming',4,10);

