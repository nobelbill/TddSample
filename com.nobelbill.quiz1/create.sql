create table if not exists blog (
	id int not null primary key,
	title varchar(100),
	content varchar(400)
);