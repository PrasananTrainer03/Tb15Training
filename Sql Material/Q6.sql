-- ROW_NUMBER() : Used to generate row_number on the particular field specified. 

select Empno,Ename,job,sal,comm, row_number() OVER(Order By Job) Rno
From Emp;

-- RANK() : Generates rank on the field specified 

select Empno, Ename, Job, Sal, comm, RANK() OVER(Order By Job) 'Rank'
From Emp;

-- DENSE_RANK() :Generates sequential rank number 

select Empno, Ename, Job, Sal, Comm, DENSE_RANK() OVER(Order By Job) 'Dense_Rank'
From EMp;