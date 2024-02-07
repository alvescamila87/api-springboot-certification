package com.camila.springbootcertificationnlw.useCases;

import com.camila.springbootcertificationnlw.dto.VerifyIfHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        if(verifyIfHasCertificationDTO.getEmail().equals("camila@gmail.com") && verifyIfHasCertificationDTO.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
