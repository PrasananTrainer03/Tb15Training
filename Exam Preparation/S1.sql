-- Display all records from UserDetails Table 

select * from UserDetails;

-- Display UserName,FirstName,City,State,Mobile from UserDetails table 

select UserName,FirstName,City,State,Mobile
from UserDetails;

-- Display how many users are there based on city wise 

select city,count(*) from UserDetails 
group by city;

-- Identify is that correct query or not 

select city, count(*) from UserDetails 
group by city 
having count(*) > 2;