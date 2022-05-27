-- Display records from wallet;

select * from wallet;

-- Display all UserFirstName, and LastName for whom  have 'gpay' 

select Firstname,LastName from UserDetails where UserID IN(
select distinct userId from wallet where Wallet_Type IN( 'GPAY'));


select Firstname,LastName from UserDetails where UserID IN(
select distinct userId from Wallet where USERID <> ALL(
select distinct userId from wallet where Wallet_Type IN( 'GPAY')));

