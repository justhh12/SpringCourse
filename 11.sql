CREATE TABLE Person(
   id SERIAL PRIMARY KEY,
   name varchar(100) NOT NULL,
   age int CHECK(age < 100)
	)

CREATE TABLE Passport(
   person_id SERIAL PRIMARY KEY REFERENCES Person(id) ON DELETE CASCADE,
   passport_number varchar(100) NOT NULL
	)
	
	
CREATE TABLE Actor(
   actor_id SERIAL PRIMARY KEY,
   name varchar(100) NOT NULL UNIQUE,
   age int CHECK(age > 0)
	)

CREATE TABLE Movie(
   movie_id SERIAL PRIMARY KEY,
   name varchar(100) NOT NULL,
   year_of_production int CHECK(year_of_production > 1900)
	)
	
