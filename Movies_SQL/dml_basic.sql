#CRUD
###################
#READ
###################

#Read this as read all entries (rows) from the table movies
#*is a wild card for ALL
SELECT* FROM movies;

####################
#Create
###################
#insert data into title
#"Don't look up"
#"Interstellar"
INSERT INTO movies (title) VALUES ('Don''t look up');
INSERT INTO movies (title) VALUES ('Interstellar');
INSERT INTO movies (title) VALUES('King Kong');


####################
#Update
####################
#UPDATE title 'Don''t look up to 'Pretty Woman'
UPDATE movies SET title = 'Pretty Woman' WHERE id= 2;
#Update King Kong to be King Kong vs. Godzilla
UPDATE movies SET title ='King Kong vs. Godzilla' WHERE id = 4;
####################
#Delete
####################
#delete title "Don't look up";
DELETE FROM movies WHERE title;
#delete tiitle "Don't look up"  LIMIT 5;
DELETE FROM movies WHERE title = 'Don''t look up' LIMIT 5;

