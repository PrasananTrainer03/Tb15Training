desc courses;

desc faculty;

desc course_faculty;

select C.Ccode,C.Name,C.Duration,C.Fee,
F.Faccode,F.Name,F.Qual
from Courses C INNER JOIN Course_Faculty CF 
ON C.Ccode= CF.Ccode 
INNER JOIN Faculty F ON 
F.Faccode=CF.Faccode;
