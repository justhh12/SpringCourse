CREATE TABLE Person(
   id SERIAL PRIMARY KEY,
   name varchar(100) NOT NULL,
   age int CHECK(age < 100)
	)

CREATE TABLE Passport(
   person_id SERIAL PRIMARY KEY REFERENCES Person(id) ON DELETE CASCADE,
   pasport_number varchar(100) NOT NULL
	)