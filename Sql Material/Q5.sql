select Empno,ename,job,sal,deptno from Emp;

-- Write a query, as if DeptNO is 10 then manager is 'CHETAN'
					 -- if DeptNO is 20 then Manager is 'Mahesh
                     -- If DeptNo is 30 then Manager is 'Lakshmi Priya' 
                     

select Empno,Ename,job,sal,DeptNo,
CASE DeptNo
   WHEN 10 THEN 'Chetan'
   WHEN 20 THEN 'Mahesh'
   WHEN 30 THEN 'Lakshmi Priya'
   else 'Invalid value'
END 'Manager Name'      
from Emp;
	
select Empno, ename,job,sal,Comm from Emp;

select Empno,Ename,Job,Sal,comm,
  CASE WHEN COMM IS NULL 	
		THEN 0 
	ELSE COMM 
    END 'Updated Comm'
from Emp;

-- Write a Query as generate derived attribute as TakeHOme, as if comm is null the sal as takehome,
 -- else sal+comm as takehome 
 
 select Empno, Ename, job,sal,comm,
	CASE WHEN comm is NULL 
			THEN SAL 
	else SAL+COMM 
    END 'Take Home'
 from Emp;
 