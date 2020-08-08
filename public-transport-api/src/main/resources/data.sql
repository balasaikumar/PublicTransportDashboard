DROP TABLE IF EXISTS BUS;
 
CREATE TABLE BUS(
  BUS_ID INT AUTO_INCREMENT  PRIMARY KEY,
  BusNumber VARCHAR(250) NOT NULL,
  Capacity INT,
  FuelConsumption  INT,
  CurrentPassengerCount  INT
);
insert into BUS(BUS_ID,BusNumber,Capacity,FuelConsumption,CurrentPassengerCount) values(1,'287A',100,70,55); 
insert into BUS(BUS_ID,BusNumber,Capacity,FuelConsumption,CurrentPassengerCount) values(2,'287B',100,30,40); 
insert into BUS(BUS_ID,BusNumber,Capacity,FuelConsumption,CurrentPassengerCount) values(3,'244C',100,50,90); 
insert into BUS(BUS_ID,BusNumber,Capacity,FuelConsumption,CurrentPassengerCount) values(4,244K',100,100,20); 


DROP TABLE IF EXISTS MAINTANANCE;

CREATE TABLE MAINTANANCE (
  MAINTANANCE_ID INT AUTO_INCREMENT  PRIMARY KEY,
  foreign key (BUS_ID) references BUS(BUS_ID),
  MaintananceTime INT,
  LastMaintanace TIMESTAMP
);

insert into MAINTANANCE(BUS_ID,BUS_ID,MaintananceTime,LastMaintanace) values(11,1,"10-05-2020");  
insert into MAINTANANCE(BUS_ID,BUS_ID,MaintananceTime,LastMaintanace) values(12,2,"10-06-2020");  
insert into MAINTANANCE(BUS_ID,BUS_ID,MaintananceTime,LastMaintanace) values(13,3,"10-07-2020");  
insert into MAINTANANCE(BUS_ID,BUS_ID,MaintananceTime,LastMaintanace) values(14,4,"05-08-2020");  

DROP TABLE IF EXISTS INCIDENT;

CREATE TABLE INCIDENT (
  INCIDENT_ID INT AUTO_INCREMENT  PRIMARY KEY,
  foreign key (BUS_ID) references BUS(BUS_ID),
  IncidentMessage VARCHAR(250),
  LastIncident TIMESTAMP
  
);

insert into INCIDENT(INCIDENT_ID,BUS_ID,IncidentMessage,LastIncident) values(21,1,"Accident","10-05-2020");

DROP TABLE IF EXISTS ROUTEDETAILS;

CREATE TABLE ROUTEDETAILS (
  ROUTE_ID INT AUTO_INCREMENT  PRIMARY KEY,
  foreign key (BUS_ID) references BUS(BUS_ID),
  Latitude - VARCHAR(250),
  Longitude - VARCHAR(250),
  StartTime - TIMESTAMP,
  EndTime - TIMESTAMP
  
);

insert into ROUTEDETAILS(ROUTE_ID,BUS_ID,Latitude,Longitude,StartTime,EndTime) values(31,1,"200","400","02-05-2020","10-05-2020"); 


