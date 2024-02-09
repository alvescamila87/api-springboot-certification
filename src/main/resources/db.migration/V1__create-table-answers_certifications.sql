CREATE TABLE certification_student (
    id UUID PRIMARY KEY NOT NULL,
    certification_id UUID NOT NULL REFERENCES certification_student(id),
    student_id UUID NOT NULL REFERENCES student(id),
    question_id UUID NOT NULL,
    answer_id UUID NOT NULL,
    is_correct BOOLEAN NOT NULL
);