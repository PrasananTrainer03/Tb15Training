select * from students;

select * from batches;

-- Display  Ccode, and no.of Courses they are attending by students 

select ccode,count(*) from Batches
group by ccode;

-- From Students table display student names who are attending more than one batch 

select bcode,count(*) from students
group by bcode
having count(*) > 1;

select Name from students where bcode=ANY(select bcode from students
group by bcode
having count(*) > 1);