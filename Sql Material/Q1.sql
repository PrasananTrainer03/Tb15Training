-- Change to Tb15 database 
use Tb15;

-- Display list of tables avaialble in current database 

show tables;

-- Display information about Emp Table 

DESC Emp;

-- Display all records from Emp Table 

select * from Emp; 

-- Display Empno, Ename, Job, Sal from Emp Table 

select Empno, Ename, Job, sal
from Emp;
-- PROJECT Operator 

-- WHERE Clause : Used to print filtered records (based on condition) 

-- Display all records whose sal >= 2000;

select * from Emp where sal >= 2000;

-- Display all records whose job is 'CLERK' 

select * from Emp where job='CLERK';

-- Display formation whose Ename is 'ADAMS'

select * from Emp where Ename='ADAMS';

-- Display information whose Comm is null 

select * from Emp where Comm is NULL;

-- Between...AND 

select * from Emp where Sal between 1000 and 3000;

select * from Emp where sal Not between 1000 and 3000;

-- IN clause : Used to display records w.r.t. multiple values of particular field. 

select * from Emp where job in('CLERK','MANAGER');

select * from Emp where job not in('CLERK','MANAGER'); 

-- LIKE : Displays values w.r.t. Wild cards 

-- Display all records whose Ename stars with 'S'

select * from Emp where Ename like 'S%';

-- Display all records whose Ename ends with 'S' 

select * from Emp where Ename like '%S';

-- Display all records whose First char is J and 5th char is S 

select * from Emp where Ename like 'J___S';

-- Order By : used to display values w.r.t. Specific field(s) in ascending or descending order. 

select Empno,Ename,job,sal,mgr from Emp 
order by Sal;

select Empno, Ename, Job, Sal, Mgr from Emp 
order by Sal Desc;

select Empno, Ename, Job, Sal, Mgr From Emp
Order By Job, Ename;

select Empno, Ename, job,sal,mgr From EMp
order by job, Ename desc;

-- Distinct : Eliminates duplicates at the time of display 

select job from Emp;

select distinct job from Emp;

