CREATE TABLE certification_student (
    id UUID PRIMARY KEY NOT NULL,
    student_id UUID NOT NULL REFERENCES student(id),
    technology TEXT NOT NULL,
    grade INTEGER NOT NULL
);