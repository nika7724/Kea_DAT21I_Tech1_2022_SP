SHOW TABLES;
CREATE DATABASE movies;
USE movies;
#create table movies, id, title, Define a primary key in movies
CREATE TABLE IF NOT EXISTS movies(
id int AUTO_INCREMENT PRIMARY KEY, title VARCHAR(255) NOT NULL
);
#create table director, #Create a foreign key on direcotors that points to movies
CREATE TABLE IF NOT EXISTS directors(
    id int AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255),
movie_id int,
FOREIGN KEY(movie_id) REFERENCES movies(id)
);
#create table actor
CREATE TABLE IF NOT EXISTS actors (
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);
#create table movies and acotrs
CREATE TABLE IF NOT EXISTS movies_actors (
    id int AUTO_INCREMENT PRIMARY KEY,
    movie_id INT,
    actor_id INT,
    FOREIGN KEY (movie_id) REFERENCES movies(id),
    FOREIGN KEY (actor_id) REFERENCES actors(id)
);

#create production_teams table
CREATE TABLE IF NOT EXISTS production_teams (
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

#Add column year
ALTER TABLE movies ADD COLUMN year YEAR;
#Delete column year
ALTER TABLE movies DROP COLUMN year;
#Modify year
ALTER TABLE movies MODIFY year INT(4);
#delete table movies
DROP TABLE movies;

#Databases, Tables, Columns vs. Data(in rows)
#DDL vs. DML
#CRUD