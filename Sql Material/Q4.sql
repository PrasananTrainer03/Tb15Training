-- Aggregate Functions

-- SUM() : Performs sum operation on the given numberic field. 

select sum(sal) from Emp;

-- AVG() : Performs avg operation on the given field 

select Avg(sal) from Emp; 

-- Max() : Display's max. value 

select max(sal) from Emp;

-- Min() : Displays min. value 

select min(sal) from Emp;

-- count(*) : Displays total no.of records available in current table. 

select count(*) from Emp;

select count(*) from Dept;