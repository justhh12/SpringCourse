insert into person values(1, 'Tom', 24, 'tom@mail.ru');
insert into person values(2, 'Bob', 52, 'bob@mail.ru');
insert into person values(3, 'Mike', 18, 'mike@mail.ru');
insert into person values(4, 'Katy', 21, 'katy@mail.ru');

CREATE TABLE public.Director (
	director_id SERIAL PRIMARY KEY,
	name varchar(100) NOT NULL UNIQUE,
	age int CHECK (age > 10)
)

CREATE TABLE public.Movie (
	movie_id SERIAL PRIMARY KEY,
	director_id int NOT NULL REFERENCES Director(director_id),
	name varchar(200) NOT NULL,
	year_of_production int CHECK (year_of_production > 1900)
)

INSERT INTO Director(name,age) VALUES('Quentin Tarantino',57);
INSERT INTO Director(name,age) VALUES('Martin Scorsese',78);
INSERT INTO Director(name,age) VALUES('Guy Ritchie',52);
INSERT INTO Director(name,age) VALUES('Woody Alle',85);
INSERT INTO Director(name,age) VALUES('David Lynch',74);
INSERT INTO Director(name,age) VALUES('Cristopher Nolan',50`);

