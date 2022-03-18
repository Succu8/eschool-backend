drop table if exists student;

create table student(
                        id int auto_increment primary key not null,
                        name varchar(50) not null,
                        surname varchar(50) not null,
                        course int,
                        direction varchar,
                        gpa double
);
