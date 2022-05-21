-- Display maximum salary 

select max(sal) from Emp;

-- Display the name of the person who is getting maximum salary 

-- select Ename from Emp where sal=max(sal);

select ename from Emp where sal = (select max(sal) from Emp);

-- Display 2nd max. salary 

select max(sal) from Emp where sal < (select max(sal) from Emp);

-- Display 2nd Min. salary 

select min(sal) from Emp where sal > (select min(sal) from Emp);

-- Display 2nd max. annualpremium from policy table

select max(annualpremium) from Policy where annualPremium < (select 
max(annualpremium) from Policy);

-- Display matching records from Dept and Emp table 

select * from Dept where deptno = (select deptno from Emp);

select * from Dept where deptno = ANY(select deptno from  Emp);

-- Display Idle Departments (which is there in Dept table and not there in Emp table) 

select * from Dept where deptNo <> ALL(select DeptNo from Emp);

-- Display matching agents from Agent and AgentPolicy 

select * from Agent where AgentID = ANY(select AgentId from AgentPolicy);

-- Display Idle agents (which is there in Agent Table, but not there in AgentPolicy 
-- table)

select * from Agent where AgentID <> ALL(select AgentId From AgentPolicy);

-- Display Matching policies from Both Policy and AgentPolicy tables 

select * from Policy where PolicyID = ANY(select PolicyID from AgentPolicy);

--  Display Idle policies 

select * from Policy where PolicyID <> ALL(select PolicyId from AgentPolicy);