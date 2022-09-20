----- Initial Object Types -----

insert into object_types (object_type_id, parent_id, name) values (111, null, 'Resource');
insert into object_types (object_type_id, parent_id, name) values (151, 111, 'Resource Pool');
insert into object_types (object_type_id, parent_id, name) values (50, null, 'Parent Site');
insert into object_types (object_type_id, parent_id, name) values (888, 111, 'Phone Number');
insert into object_types (object_type_id, parent_id, name) values (900, 888, 'Mobile Phone Number');
insert into object_types (object_type_id, parent_id, name) values (910, 888, 'Fixed Phone Number');
insert into object_types (object_type_id, parent_id, name) values (555, 111, 'SIM Card');
insert into object_types (object_type_id, parent_id, name) values (600, 555, 'pSIM');
insert into object_types (object_type_id, parent_id, name) values (610, 555, 'eSIM');
insert into object_types (object_type_id, parent_id, name) values (200, null, 'Order');
insert into object_types (object_type_id, parent_id, name) values (201, 200, 'Service Order');

----- Initial attributes -----

insert into attributes (attr_id, parent_id, name) values (505, null, 'Status');
insert into attributes (attr_id, parent_id, name) values (2001, null, 'Quantity');

----- Initial List Values -----

insert into list_values (list_value_id, list_value) values (81, 'Available');
insert into list_values (list_value_id, list_value) values (82, 'Pending');
insert into list_values (list_value_id, list_value) values (83, 'Reserved');
insert into list_values (list_value_id, list_value) values (84, 'In Use');
insert into list_values (list_value_id, list_value) values (85, 'Terminated');


----- Initial Objects -----

insert into objects (object_id, parent_id, object_type_id, name) values (1001, null, 50, 'Resource Inventory');

----- Initial Mobile Number Pool -----
insert into objects (object_id, parent_id, object_type_id, name) values (1110, 1001, 151, 'Mobile Phone Number Pool');
insert into objects (object_id, parent_id, object_type_id, name) values (50017, 1110, 900, '7510793370');
insert into objects (object_id, parent_id, object_type_id, name) values (50038, 1110, 900, '7919030806');
insert into objects (object_id, parent_id, object_type_id, name) values (50027, 1110, 900, '6984653381');
insert into objects (object_id, parent_id, object_type_id, name) values (50020, 1110, 900, '0160597655');
insert into objects (object_id, parent_id, object_type_id, name) values (50023, 1110, 900, '7460550186');
insert into objects (object_id, parent_id, object_type_id, name) values (50045, 1110, 900, '7172501601');
insert into objects (object_id, parent_id, object_type_id, name) values (50039, 1110, 900, '6246902479');
insert into objects (object_id, parent_id, object_type_id, name) values (50049, 1110, 900, '4059168865');
insert into objects (object_id, parent_id, object_type_id, name) values (50001, 1110, 900, '3844915191');
insert into objects (object_id, parent_id, object_type_id, name) values (50025, 1110, 900, '4834182086');
insert into objects (object_id, parent_id, object_type_id, name) values (50040, 1110, 900, '3529306900');
insert into objects (object_id, parent_id, object_type_id, name) values (50021, 1110, 900, '4575095239');
insert into objects (object_id, parent_id, object_type_id, name) values (50018, 1110, 900, '7415623237');
insert into objects (object_id, parent_id, object_type_id, name) values (50043, 1110, 900, '6617307382');
insert into objects (object_id, parent_id, object_type_id, name) values (50011, 1110, 900, '5795218216');
insert into objects (object_id, parent_id, object_type_id, name) values (50036, 1110, 900, '3126540327');
insert into objects (object_id, parent_id, object_type_id, name) values (50010, 1110, 900, '3434162358');
insert into objects (object_id, parent_id, object_type_id, name) values (50002, 1110, 900, '4345267921');
insert into objects (object_id, parent_id, object_type_id, name) values (50028, 1110, 900, '4869892595');
insert into objects (object_id, parent_id, object_type_id, name) values (50047, 1110, 900, '2049268893');

----- Initial Fixed Number Pool -----
insert into objects (object_id, parent_id, object_type_id, name) values (1120, 1001, 151, 'Fixed Phone Number Pool');
insert into objects (object_id, parent_id, object_type_id, name) values (60010, 1120, 910, '202926');
insert into objects (object_id, parent_id, object_type_id, name) values (60040, 1120, 910, '147826');
insert into objects (object_id, parent_id, object_type_id, name) values (60025, 1120, 910, '450476');
insert into objects (object_id, parent_id, object_type_id, name) values (60003, 1120, 910, '865406');
insert into objects (object_id, parent_id, object_type_id, name) values (60028, 1120, 910, '927630');
insert into objects (object_id, parent_id, object_type_id, name) values (60036, 1120, 910, '331974');
insert into objects (object_id, parent_id, object_type_id, name) values (60031, 1120, 910, '291921');
insert into objects (object_id, parent_id, object_type_id, name) values (60026, 1120, 910, '362411');
insert into objects (object_id, parent_id, object_type_id, name) values (60004, 1120, 910, '702176');
insert into objects (object_id, parent_id, object_type_id, name) values (60022, 1120, 910, '994101');
insert into objects (object_id, parent_id, object_type_id, name) values (60044, 1120, 910, '359530');
insert into objects (object_id, parent_id, object_type_id, name) values (60002, 1120, 910, '692384');
insert into objects (object_id, parent_id, object_type_id, name) values (60019, 1120, 910, '029100');
insert into objects (object_id, parent_id, object_type_id, name) values (60030, 1120, 910, '810834');
insert into objects (object_id, parent_id, object_type_id, name) values (60015, 1120, 910, '240758');
insert into objects (object_id, parent_id, object_type_id, name) values (60027, 1120, 910, '769880');
insert into objects (object_id, parent_id, object_type_id, name) values (60050, 1120, 910, '849371');
insert into objects (object_id, parent_id, object_type_id, name) values (60009, 1120, 910, '337274');
insert into objects (object_id, parent_id, object_type_id, name) values (60018, 1120, 910, '356421');
insert into objects (object_id, parent_id, object_type_id, name) values (60039, 1120, 910, '759997');
----- Initial pSim Card Pool -----
insert into objects (object_id, parent_id, object_type_id, name) values (1150, 1001, 151, 'pSim Card Pool');
insert into objects (object_id, parent_id, object_type_id, name) values (70040, 1150, 600, '895471552');
insert into objects (object_id, parent_id, object_type_id, name) values (70015, 1150, 600, '895680711');
insert into objects (object_id, parent_id, object_type_id, name) values (70007, 1150, 600, '895379200');
insert into objects (object_id, parent_id, object_type_id, name) values (70010, 1150, 600, '895734459');
insert into objects (object_id, parent_id, object_type_id, name) values (70014, 1150, 600, '895449465');
insert into objects (object_id, parent_id, object_type_id, name) values (70020, 1150, 600, '895099711');
insert into objects (object_id, parent_id, object_type_id, name) values (70002, 1150, 600, '895579641');
insert into objects (object_id, parent_id, object_type_id, name) values (70034, 1150, 600, '895555162');
insert into objects (object_id, parent_id, object_type_id, name) values (70004, 1150, 600, '895515981');
insert into objects (object_id, parent_id, object_type_id, name) values (70043, 1150, 600, '895117284');

----- Initial eSim Card Pool -----
insert into objects (object_id, parent_id, object_type_id, name) values (1160, 1001, 151, 'eSim Card Pool');
insert into objects (object_id, parent_id, object_type_id, name) values (80015, 1160, 610, '895749815');
insert into objects (object_id, parent_id, object_type_id, name) values (80021, 1160, 610, '895726357');
insert into objects (object_id, parent_id, object_type_id, name) values (80036, 1160, 610, '895553496');
insert into objects (object_id, parent_id, object_type_id, name) values (80033, 1160, 610, '895044656');
insert into objects (object_id, parent_id, object_type_id, name) values (80039, 1160, 610, '895376575');
insert into objects (object_id, parent_id, object_type_id, name) values (80041, 1160, 610, '895464582');
insert into objects (object_id, parent_id, object_type_id, name) values (80014, 1160, 610, '895572500');
insert into objects (object_id, parent_id, object_type_id, name) values (80011, 1160, 610, '895680897');
insert into objects (object_id, parent_id, object_type_id, name) values (80026, 1160, 610, '895084473');
insert into objects (object_id, parent_id, object_type_id, name) values (80031, 1160, 610, '895208508');



CREATE SEQUENCE "param_id_seq"
MINVALUE 1
MAXVALUE 9999999
INCREMENT BY 3
START WITH 500
NOCACHE
NOCYCLE;

--- only for h2


insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50017, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50038, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50027, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50020, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50023, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50045, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50039, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50049, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50001, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50025, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50040, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50021, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50018, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50043, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50011, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50036, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50010, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50002, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50028, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 50047, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60010, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60040, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60025, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60003, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60028, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60036, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60031, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60026, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60004, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60022, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60044, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60002, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60019, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60030, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60015, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60027, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60050, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60009, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60018, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 60039, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70040, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70015, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70007, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70010, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70014, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70020, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70002, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70034, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70004, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 70043, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80015, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80021, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80036, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80033, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80039, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80041, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80014, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80011, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80026, 505, 81, null);
insert into params (param_id, object_id, attr_id, list_value_id, text) values(nextval('param_id_seq'), 80031, 505, 81, null);





-- CREATE SEQUENCE "param_id_seq"
-- MINVALUE 1
-- MAXVALUE 9999999
-- INCREMENT BY 3
-- START WITH 500
-- NOCACHE
-- NOCYCLE;
--
-- insert into params values
-- select
--     nextval('param_id_seq') as param_id
--     o.object_id,
--     505 as attr_id,
--     81 as list_value_id,
--     null as text
-- from objects as o;
--
--
--
-- insert into params (param_id, object_id, attr_id, list_value_id, text) values(
-- select
--     nextval('param_id_seq') as param_id
--     o.object_id,
--     505 as attr_id,
--     81 as list_value_id,
--     null as text
-- from objects as o
-- where object_type_id in (900, 910, 151, ));



