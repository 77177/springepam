INSERT INTO authorities (username, authority)
VALUES ('tutor', 'TUTOR');

INSERT INTO authorities (username, authority)
VALUES ('student', 'STUDENT');

INSERT INTO users (username, first_name, last_name, auth_id, password, enabled)
VALUES ('tutor', 'MIKE', 'MIKE', 1, '$2a$10$yzQKcztHEkgun6FfocgWrOYZmSkx5AjmCW/.v.7aR4ovMMj2a9nWG', true);

INSERT INTO users (username, first_name, last_name, auth_id, password, enabled)
VALUES ('student', 'JOHN', 'JOHN', 2, '$2a$10$7KRbD7KtoPToWJsz0UBa3esGoVHoe2Yo2CqlZf.fUpq34MSOORO9W', true);


INSERT INTO tutors (user_id)
VALUES (1);

INSERT INTO students (user_id)
VALUES (2);

INSERT INTO courses (name, tutor_id, starting_date, finishing_date)
VALUES ('COURSE_1', 1, '1111-11-11', '2211-01-01');

