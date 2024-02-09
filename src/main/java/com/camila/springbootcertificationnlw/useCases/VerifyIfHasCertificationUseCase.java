package com.camila.springbootcertificationnlw.useCases;

import com.camila.springbootcertificationnlw.dto.VerifyIfHasCertificationDTO;
import com.camila.springbootcertificationnlw.repository.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(verifyIfHasCertificationDTO.getEmail(), verifyIfHasCertificationDTO.getTechnology());
        if(!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
