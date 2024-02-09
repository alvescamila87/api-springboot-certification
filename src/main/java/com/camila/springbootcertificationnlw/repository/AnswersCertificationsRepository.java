package com.camila.springbootcertificationnlw.repository;

import com.camila.springbootcertificationnlw.entities.AnswersCertificationsEntity;
import com.camila.springbootcertificationnlw.entities.CertificationStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AnswersCertificationsRepository extends JpaRepository<AnswersCertificationsEntity, UUID> {
}
