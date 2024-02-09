package com.camila.springbootcertificationnlw.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "certification_student")
@Table(name = "certification_student")
@EqualsAndHashCode(of = "id")
public class CertificationStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "student_id")
    private UUID studentID;

    private String technology;

    private int grade;

    @OneToMany(mappedBy = "certification")
    private List<AnswersCertificationsEntity> answersCertificationsEntity;
}
