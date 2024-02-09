package com.camila.springbootcertificationnlw.repository;

import com.camila.springbootcertificationnlw.entities.CertificationStudentEntity;
import com.camila.springbootcertificationnlw.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {
}
