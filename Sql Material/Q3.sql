-- Date Functions 

select curdate(); -- Displays today's date

select curtime(); -- Displays today's time

select month(curdate()); -- Displays Month number 

select year(curdate()); -- Displays Year

select day(curdate()); -- Displays day of the month 

select dayofweek(curdate()); -- Displays the weekday number

select dayofyear(curdate()); -- Displays the Day of year 

select last_day(curdate());

select adddate(curdate(),INTERVAL 5 day); 

select adddate(curdate(), INTERVAL 3 MONTH);

select adddate(curdate(), INTERVAL 3 YEAR);
