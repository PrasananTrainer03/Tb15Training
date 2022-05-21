-- Display information (structure) about Agent Table 

Desc Agent;

-- Display All records from Agent Table 

select * from Agent;

-- Projection (Display AgentId, FirstName, LastName, City, State,Gender,SSN) from Agent Table 

select AgentId,FirstName,LastName,City,State,Gender,SSN from Agent;

-- Display all records from Agent table whose AgentID range from 1 to 10 

select * from Agent where AgentID between 1 and 100;

-- Display all records from Agent whose gender is 'Female' 

select * from Agent where gender='Female';

-- Display all unmarried agent details (is MaritalsStatus is 0 then unmarried 1 means married) 

select * from Agent where MaritalStatus=0;

-- Display count of Male and Female agents 

select Gender,count(*) from Agent 
group by Gender;

-- Display City wise how many agents are there 

select city,count(*) from Agent 
group by city;

-- Display information as how much salary paying to each dept, and total salary must 
-- be greater than or equals to 5000

select job, sum(sal) from Emp 
group by JOb
having sum(sal) >= 5000;

-- Dispaly all records from Emp table whose dept contains more than 1 employ 

select Job, count(*) from Emp 
group by job
having count(*) > 1;

-- Display all records of emp table whose dept max(sal) > 1500

select job,max(sal) from Emp 
group by job 
having max(sal) > 1500;

