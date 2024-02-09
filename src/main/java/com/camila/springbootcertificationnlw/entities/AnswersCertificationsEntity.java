package com.camila.springbootcertificationnlw.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answers_certifications")
@Table(name = "answers_certifications")
@EqualsAndHashCode(of = "id")
public class AnswersCertificationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "certification_id")
    private UUID certificationID;

    @Column(name = "student_id")
    private UUID studentID;

    @Column(name = "question_id")
    private UUID questionID;

    @Column(name = "answer_id")
    private UUID answerID;

    @Column(name = "is_correct")
    private boolean isCorrect;
}
