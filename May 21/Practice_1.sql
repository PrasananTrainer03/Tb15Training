-- Display information about Students table 

Desc students;

-- Display all records from Students table 

select * from Students;

-- Display inforamtion about batches table 

desc batches;

-- Display all records from batches table 

select * from Batches;

desc batches;

-- Apply Inner Join on Batches and Students table 

select B.Bcode,Ccode,Faccode,S.Name,Gender,DJ
from Batches B INNER JOIN Students S 
On B.Bcode = S.Bcode ;

-- Apply Left Outer Join On Above Table 

select B.Bcode,Ccode,Faccode,S.Name,Gender,DJ
from Batches B LEFT JOIN Students S 
On B.Bcode = S.Bcode ;

