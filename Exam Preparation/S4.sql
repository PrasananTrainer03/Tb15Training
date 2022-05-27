select sum(sal), avg(sal), max(sal), min(sal) from Emp;

select job, sum(sal), avg(sal), max(sal), min(sal) from Emp
group by job;

select job, count(*) from emp
group by job;

select count(*) from Emp 
where job='MANAGER';

select max(sal)-min(sal) from emp;