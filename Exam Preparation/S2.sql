select count(*) from Emp ;

-- what it will return ??? 

-- Ans : No.of records/tuples from Emp table

select count(comm) from Emp ;

-- Above command returns ???

-- returns no.of tuples for with comm is not null 
select comm from EMp;


select empno,ename,sal from emp
order by ename
where sal > 2000;

-- Order By Always comes last. 

select empno,ename,sal from emp
where sal > 2000
order by ename;

-- What is the Order Priority is 

-- Where Clause -- Group By -- Having -- Order By 

select job, sum(sal), count(*) from Emp 
where job in('CLERK','MANAGER','PRESIDENT')
group by job
having sum(sal) > 2000 
order by job;

-- Write a query which displays all records from Emp table whose ename starts with J and 5th char is S

select * from Emp where ename like 'j___s';

-- Which clause used to eliminate duplicatates at time of display 
DISTINCT 

select job from Emp;

select distinct job from Emp;

Write a query to retrieve all records whose comm is not null 

select * from Emp where comm is not null;

select * from Emp 
order by job,ename

What is the purpose of group by 

What is the difference between WHERE and HAVING clause 

Is any table can be joined with itself ???


If table A contains n records, table B contains m records then which generates cartician product of two tables. 

