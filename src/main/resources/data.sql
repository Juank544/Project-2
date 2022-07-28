-- teams
insert into teams values (201, 4,'Christian Horner','Oracle Red Bull Racing');
insert into teams values (202, 8,'Toto Wolf','Mercedes-AMG Petronas F1 Team');
insert into teams values (203, 16,'Mattia Binotto','Scuderia Ferrari');
insert into teams values (204, 8,'Andreas Seidl','Mclaren F1 Team');
insert into teams values (205, 2,'Otmar Szafnauer','BWT Alpine F1 Team');
insert into teams values (206, 0,'Frederic Vasseur','Alfa Romeo F1 Team ORLEN');
insert into teams values (207, 0,'Franz Tost','Scuderia AlphaTauri');
insert into teams values (208, 0,'Guenther Steiner','Hass F1 Team');
insert into teams values (209, 0,'Mike Krack','Aston Martin Aramco Cognizant F1 Team');
insert into teams values (210, 9,'Jost Capito','Williams Racing');

-- cars
insert into cars values (101, 'RB18','Red Bull Powertrains', 201);
insert into cars values (102, 'W13','Mercedes', 202);
insert into cars values (103, 'F1-75','Ferrari', 203);
insert into cars values (104, 'MCL36','Mercedes', 204);
insert into cars values (105, 'A522','Renault', 205);
insert into cars values (106, 'C42','Ferrari', 206);
insert into cars values (107, 'AT03','Red Bull Powertrains', 207);
insert into cars values (108, 'VF-22','Ferrari', 208);
insert into cars values (109, 'AMR22','Mercedes', 209);
insert into cars values (110, 'FW44','Mercedes', 210);

-- drivers
insert into drivers values (1,'1997-09-30',1,'Netherlands','Max Verstappen', 101);
insert into drivers values (11,'1990-01-26',0,'Mexico','Sergio Perez', 101);
insert into drivers values (44,'1985-01-07',7,'United Kingdom','Lewis Hamilton', 102);
insert into drivers values (63,'1998-02-15',0,'United Kingdom','George Russell', 102);
insert into drivers values (16,'1997-10-16',0,'Monaco','Charles Leclerc', 103);
insert into drivers values (55,'1994-09-01',0,'Spain','Carlos Sainz', 103);
insert into drivers values (4,'1999-11-13',0,'United Kingdom','Lando Norris', 104);
insert into drivers values (3,'1989-07-01',0,'Australia','Daniel Ricciardo', 104);
insert into drivers values (14,'1981-07-29',2,'Spain','Fernando Alonso', 105);
insert into drivers values (31,'1996-09-17',0,'France','Esteban Ocon', 105);
insert into drivers values (77,'1989-08-28',0,'Finland','Valtteri Bottas', 106);
insert into drivers values (24,'1999-05-30',0,'China','Zhou Guanyu', 106);
insert into drivers values (10,'1996-02-07',0,'France','Pierre Gasly', 107);
insert into drivers values (22,'2000-05-11',0,'Japan','Yuki Tsunoda', 107);
insert into drivers values (47,'1999-03-22',0,'Germany','Mick Schumacher', 108);
insert into drivers values (20,'1992-10-05',0,'Denmark','Kevin Magnussen', 108);
insert into drivers values (5,'1987-07-03',4,'Germany','Sebastian Vettel', 109);
insert into drivers values (18,'1998-10-29',0,'Canada','Lance Stroll', 109);
insert into drivers values (23,'1996-03-23',0,'Thailand','Alexander Albon', 110);
insert into drivers values (6,'1995-06-29',0,'Canada','Nicholas Latifi', 110);