package com.camila.springbootcertificationnlw.repository;

import com.camila.springbootcertificationnlw.entities.CertificationStudentEntity;
import com.camila.springbootcertificationnlw.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

    @Query("SELECT c FROM certification_student c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
}
