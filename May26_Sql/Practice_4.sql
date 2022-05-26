use tb15practice;

drop table if exists AgentPolicy;

/* **************************************************************************
					    Creating AgentPolicy Table 
   **************************************************************************
*/

Create Table AgentPolicy
(
    AgentId INT,
    PolicyID INT,
    IsSplitAgent INT,
    FOREIGN KEY(AgentID) REFERENCES  Agent(AgentID),
    FOREIGN KEY(PolicyID) REFERENCES Policy(PolicyID),
    Primary Key(AgentID,PolicyID)
);

/* *********************************************************************
					Insert into AgentPolicy Table 
   *********************************************************************
*/

Insert into AgentPolicy(AgentId,PolicyID,IsSplitAgent)
VALUES(1,1,2),
	  (1,3,1),
  	  (2,3,1),
	  (2,1,1),
	  (2,4,1),
	  (2,5,1),
	  (4,1,2),
	  (4,3,1),
  	  (5,1,2),
	  (5,2,1);
                    
select * from AgentPolicy;    