----- Initial Object Types -----

insert into object_types (111, null, 'Resource');
insert into object_types (151, 111, 'Resource Pool');
insert into object_types (50, null, 'Parent Site');

insert into object_types (888, 111, 'Phone Number');
insert into object_types (900, 888, 'Mobile Phone Number');
insert into object_types (910, 888, 'Fixed Phone Number');

insert into object_types (555, 111, 'SIM Card');
insert into object_types (600, 555, 'pSIM');
insert into object_types (610, 555, 'eSIM');

insert into object_types (200, null, 'Order');
insert into object_types (201, 200, 'Service Order');

----- Initial attributes -----

insert into attributes (505, null, 'Status');
insert into attributes (2001, null, 'Quantity');

----- Initial List Values -----

insert into list_values (81, 'Available');
insert into list_values (82, 'Pending');
insert into list_values (83, 'Reserved');
insert into list_values (84, 'In Use');
insert into list_values (85, 'Terminated');


----- Initial Objects -----

insert into objects (1001, null, 50, 'Resource Inventory');
insert into objects (1110, 1001, 151, 'Mobile Phone Number Pool');
insert into objects (1120, 1001, 151, 'Fixed Phone Number Pool');
insert into objects (1150, 1001, 151, 'pSim Card Pool');
insert into objects (1160, 1001, 151, 'eSim Card Pool');

----- Initial Mobile Number Pool -----
insert into objects (1110, 1001, 151, 'Mobile Phone Number Pool');
insert into objects (7609, 1110, 900, '7510793370');
insert into objects (6851, 1110, 900, '7919030806');
insert into objects (3582, 1110, 900, '6984653381');
insert into objects (6723, 1110, 900, '0160597655');
insert into objects (2259, 1110, 900, '7460550186');
insert into objects (9279, 1110, 900, '7172501601');
insert into objects (6381, 1110, 900, '6246902479');
insert into objects (4391, 1110, 900, '4059168865');
insert into objects (8942, 1110, 900, '3844915191');
insert into objects (6638, 1110, 900, '4834182086');
insert into objects (4650, 1110, 900, '3529306900');
insert into objects (9764, 1110, 900, '4575095239');
insert into objects (2711, 1110, 900, '7415623237');
insert into objects (3618, 1110, 900, '6617307382');
insert into objects (4743, 1110, 900, '5795218216');
insert into objects (2353, 1110, 900, '3126540327');
insert into objects (3187, 1110, 900, '3434162358');
insert into objects (4052, 1110, 900, '4345267921');
insert into objects (6354, 1110, 900, '4869892595');
insert into objects (6308, 1110, 900, '2029264179');
insert into objects (4801, 1110, 900, '1478260375');
insert into objects (9073, 1110, 900, '4504764266');
insert into objects (5885, 1110, 900, '8654062914');
insert into objects (9699, 1110, 900, '9276304829');
insert into objects (2900, 1110, 900, '3319746464');
insert into objects (8022, 1110, 900, '2919210660');
insert into objects (5191, 1110, 900, '3624117051');
insert into objects (4586, 1110, 900, '7021768270');
insert into objects (9438, 1110, 900, '9941017101');
insert into objects (8630, 1110, 900, '3595301448');
insert into objects (6835, 1110, 900, '6923841861');
insert into objects (8538, 1110, 900, '0291002186');
insert into objects (2504, 1110, 900, '8108343100');
insert into objects (2316, 1110, 900, '2407583674');
insert into objects (8550, 1110, 900, '7698806485');
insert into objects (7952, 1110, 900, '8493714736');
insert into objects (5465, 1110, 900, '3372740137');
insert into objects (5217, 1110, 900, '3564212771');
insert into objects (5493, 1110, 900, '7599972696');
insert into objects (9809, 1110, 900, '7871985668');

----- Initial Mobile Number Pool -----
----- Initial Mobile Number Pool -----
----- Initial Mobile Number Pool -----





