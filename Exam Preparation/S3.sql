select ename,sal from Emp where sal >= 2000;

select ename,deptno from Emp where empno=7902;

select * from Emp where sal between 2000 and 5000;

select ename,hiredate from emp where year(hiredate)=1981;

select ename,job from emp where mgr is null;

select ename from Emp where ename like '__A%';

select ename from emp where ename like '%A%' OR '%E%';

select ename,sal from emp where sal<> 1600 AND SAL <> 800 AND SAL <> 1300;

select ename,sal,comm from emp where comm is not null
order by sal desc,comm desc;