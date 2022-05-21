select * from batches;

-- Join batches with Faculty table 

select F.Faccode,f.name,B.Bcode,B.Stdate,B.EndDate
from Faculty F INNER JOIN Batches B ON 
F.Faccode = B.Faccode;

-- Display count as how many batches are taken by each faculty 

select F.Faccode,Count(*)
from Faculty F INNER JOIN Batches B ON 
F.Faccode = B.Faccode
group by F.Faccode;

-- Display Faculty Name who is taking more than one batch 

select * from Faculty where Faccode = ANY(
select F.Faccode
from Faculty F INNER JOIN Batches B ON 
F.Faccode = B.Faccode
group by F.Faccode
having count(*) >1);


