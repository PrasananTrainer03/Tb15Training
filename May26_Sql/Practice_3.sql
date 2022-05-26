use tb15practice;

drop table if exists policy;

/* **********************************************************************************
							Creating Policy Table 
   **********************************************************************************
*/

Create Table Policy
(
   PolicyId INT primary key auto_increment,
   AppNumber varchar(30),
   AppDate date,
   PolicyNumber varchar(30),
   AnnualPremium numeric(9,2),
   PaymentModeID INT,
   ModalPremium numeric(9,2)
);

/* ************************************************************************************
					  Inserting Data into Policy Table 
   ************************************************************************************
*/

Insert into Policy(AppNumber,AppDate,PolicyNumber,AnnualPremium,PaymentModeID,ModalPremium) 
values('A001','2018-12-12','P123',184443,1,88423),
('A002','2010-12-12','C002',20000,1,12000),
('A003','2010-12-12','C003',150000,1,20000),
('A004','2005-01-02','P001',22000,1,1000),
('A005','2009-09-03','S231',122000,2,22000),
('A006','2010-02-12','A131',232000,2,21000),
('A007','2007-09-11','P231',212000,2,23000),
('A008','2009-11-12','S231',122000,2,22000),
('A009','2009-10-10','I231',192000,1,24000);

select * from Policy;

