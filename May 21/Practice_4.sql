select * from courses;

select distinct ccode from batches;

select ccode from batches;

-- Join courses and batches tables 

select C.CCode,C.name,duration,Fee,B.Bcode,Stdate,Enddate,Timing
from Courses C INNER JOIN Batches B ON 
C.CCode=B.CCODE;

-- Display courseCode for which more than one batch is running 

select C.CCode,count(*)
from Courses C INNER JOIN Batches B ON 
C.CCode=B.CCODE
group by c.ccode
having count(*) >1 ;

-- Display CourseName  for which more than one batch is running 

select * from Courses where Ccode = ANY
(
select C.CCode
from Courses C INNER JOIN Batches B ON 
C.CCode=B.CCODE
group by c.ccode
having count(*) >1 )