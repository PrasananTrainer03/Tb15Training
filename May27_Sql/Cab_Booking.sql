drop database if exists ts15cabsystem;

create database ts15cabsystem;

use ts15cabsystem;

/* ********************************************************************************************
						Creating UserDetails Table
   ********************************************************************************************
*/

Create Table UserDetails
(
   UserId INT auto_increment primary key,
   UserName varchar(30) UNIQUE KEY,
   PassCode varchar(30),
   FirstName varchar(30),
   LastName varchar(30),
   City varchar(30),
   State varchar(30),
   Email varchar(30),
   Mobile varchar(80)
);

/*  *********************************************************************************************
							Inserting Data into UserDetails Table
	*********************************************************************************************
*/

Insert into UserDetails(userName,PassCode,FirstName,LastName,City,State,Email,Mobile) 
values('Ravinand','ravi@123','Ravi','Pedapati','Kakinada','AP','ravin@gmail.com','982838455'),
('Dharani','suryad@123','Surya Sri','Dharani','Vijayawada','AP','dharani@gmail.com','99382345'),
('yellaji','yellaji@123','Yellaji','Garikina','Kakinada','AP','yellaji@gmail.com','94923544335'),
('karthiks','sanjay@123','Karthik','Sanjay Koppula','Kakinada','AP','sanjay@gmail.com','992383845'),
('Sailaja','sailaja@123','Sailaja','Vangala','Kakinada','AP','sailaja@gmail.com','848382344'); 

select * from UserDetails;

drop Table if exists DriverDetails;

/* **********************************************************************************************
						Creating DriverDetails Table
   **********************************************************************************************
*/

Create Table DriverDetails
(
    DriverId INT auto_increment Primary Key,
    DriverUserName varchar(30) UNIQUE KEY,
    DriverPassword varchar(30),
    DriverFirstName varchar(30),
    DriverLastName varchar(30),
    DriverCity varchar(30),
    DriverState varchar(30),
    DriverMobile varchar(30),
    DriverEmail varchar(30),
    CabType ENUM('MINI','PRIME','SUV','XL','MICRO'),
    CabStatus ENUM('AVAILABLE','BOOKED','CANCELLED') DEFAULT 'AVAILABLE'
);

/*  ********************************************************************************************
							Inserting Data into DriverDetails Table
	********************************************************************************************
*/

Insert into DriverDetails(DriverUserName,DriverPassword,DriverFirstName,
DriverLastName,DriverCity,DriverState,DriverMobile,DriverEmail,CabType)
values('Khaeel','sheik@123','Khaleel','Sheik','Chennai','TN','9942835',
'khaleel@gmail.com','MINI'),
('Bunty','Buntyjain@123','Bunty','Jain','Kohima','NL','99482355','buntyjain@gmail.com','SUV'),
('Naveen','naveenvelaga','Naveen','Kumar','Hyderabad','TS','99429355','naveenk@gmail.com','Prime'),
('Vinay','chodavarapu12','Vinay','Reddy','Tirupathi','TS','99492355','vijaych@gmail.com','XL');

select * from DriverDetails;

/* **********************************************************************************************
						Creating DriverDetails Table
   **********************************************************************************************
*/

Drop Table If Exists Wallet;

Create Table Wallet
(
    WalletId INT primary Key auto_increment,
    WalletType ENUM('GPAY','PAYTM','PHONEPE'),
    UserId INT references UserDetails(UserId),
    WalletAmount numeric(9,2)
);

/*  ************************************************************************************
					Inserting Records into Wallet Table 
	************************************************************************************
*/


Insert into Wallet(WalletType,UserID,WalletAmount)
values('PAYTM',1,4823),('PHONEPE',1,4884),
('PAYTM',2,5523),('GPAY',2,8483),('PHONEPE',2,5852),
('PAYTM',3,4842),('PHONEPE',3,8324),('GPAY',3,8482),
('PAYTM',4,8822),('PHONEPE',4,6323),
('PHONEPE',5,8823),('GPAY',5,4433);

select * from Wallet;

/* ***********************************************************************************************
						Creating Booking Table
   ***********************************************************************************************
*/

Create Table Booking
(
   BookingID INT auto_increment Primary Key,
   BookingDate Date,
   UserId INT REFERENCES UserDetails(UserId),
   DriverId INT REFERENCES DriverDetails(DriverID),
   StartingLocation varchar(30),
   EndingLocation varchar(30),
   Kilometers numeric(9,2),
   BookingStatus ENUM('AVAILABLE','BOOKED','CANCELLED','COMPLETED') DEFAULT 'AVAILABLE',
   BillAmount Numeric(9,2)
);

select * from Booking;