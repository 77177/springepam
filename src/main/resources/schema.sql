CREATE TABLE authorities
(
  id        INT SERIAL,
  username  VARCHAR(40),
  authority VARCHAR(40),
  primary key (id)
);

CREATE TABLE users
(
  id         INT SERIAL,
  first_name VARCHAR(40),
  last_name  VARCHAR(40),
  auth_id    INT,
  username   VARCHAR(40),
  password   VARCHAR(400),
  enabled    BOOLEAN,
  primary key (id),
  FOREIGN KEY (auth_id) REFERENCES authorities (id)
);



CREATE TABLE tutors
(
  id INT SERIAL,
  user_id INT,
  FOREIGN KEY (user_id) REFERENCES users (id),
  primary key (id)
);
CREATE TABLE courses
(
  id             INT SERIAL,
  name           VARCHAR(40),
  tutor_id       INT,
  starting_date  DATE,
  finishing_date DATE,
  primary key (id),
  FOREIGN KEY (tutor_id) REFERENCES tutors (id)
);

CREATE TABLE students
(
  id INT SERIAL,
  user_id INT,
  primary key (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);


