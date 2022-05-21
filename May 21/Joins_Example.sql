desc Dept;

-- select Dept.Deptno,Dname,Empno,Ename,job,sal
-- from Dept,Emp Where Dept.Deptno=Emp.Deptno;

select Dept.Deptno,Dname, Empno, Ename, Job, Sal
from Dept INNER JOIN EMP ON
Dept.Deptno=Emp.Deptno;

select D.Deptno, Dname, Empno, Ename, job, sal
from Dept D INNER JOIN EMP E ON
D.Deptno=E.Deptno;

select A.AgentID, FirstName,LastName,City,State,
	P.PolicyID, AnnualPremium,PaymentModeId,ModalPremium
from Agent A INNER JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
INNER JOIN Policy P ON
P.PolicyID=AP.PolicyID;

-- LEFT OUTER JOIN Examples 

select Dept.Deptno,Dname, Empno, Ename, Job, Sal
from Dept LEFT JOIN EMP ON
Dept.Deptno=Emp.Deptno;

select A.AgentID, FirstName,LastName,City,State,
	P.PolicyID, AnnualPremium,PaymentModeId,ModalPremium
from Agent A LEFT JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
LEFT JOIN Policy P ON
P.PolicyID=AP.PolicyID;

-- Right Outer Join

select Dept.Deptno,Dname, Empno, Ename, Job, Sal
from Dept RIGHT JOIN EMP ON
Dept.Deptno=Emp.Deptno;

select A.AgentID, FirstName,LastName,City,State,
	P.PolicyID, AnnualPremium,PaymentModeId,ModalPremium
from Agent A RIGHT JOIN AgentPolicy AP 
ON A.AgentID = AP.AgentID 
RIGHT  JOIN Policy P ON
P.PolicyID=AP.PolicyID;

-- Cross Join

select * from Dept cross join Emp;

-- Self Join 

select empno,ename,job,sal,mgr from Emp;

select E1.Empno 'Manager Id', E1.Ename 'Manager Name', 
E2.Empno 'Employ Id', E2.Ename 'Employ Name'
from Emp E1 INNER JOIN Emp E2 ON
E1.Empno=E2.Mgr
Order By E1.Empno;

select E1.Empno 'Manager Id', E1.Ename 'Manager Name', 
E2.Empno 'Employ Id', E2.Ename 'Employ Name'
from Emp E1 RIGHT JOIN Emp E2 ON
E1.Empno=E2.Mgr
Order By E1.Empno;
