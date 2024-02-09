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
@Entity(name = "student")
@Table(name = "student")
@EqualsAndHashCode(of = "id")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String email;

    @OneToMany(mappedBy = "studentID")
    private List<CertificationStudentEntity> certificationStudentEntity;

}
