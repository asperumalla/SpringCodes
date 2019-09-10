insert into users (
    username ,
    password, 
    enabled 
) values (

	'emp',
	'proceed',
	true

);

insert into users (
    username ,
    password, 
    enabled 
) values (

	'visitor',
	'pass',
	true

);





insert into authorities (
    username ,
    authority 
) values (

	'emp',
	'ROLE_EMPLOYEE'
);


insert into authorities (
    username ,
    authority 
) values (

	'visitor',
	'ROLE_VISITOR'
);


