package com.camila.springbootcertificationnlw.controllers;

import com.camila.springbootcertificationnlw.dto.VerifyIfHasCertificationDTO;
import com.camila.springbootcertificationnlw.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    // Preciso usar o meu USECASE
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        System.out.println(verifyIfHasCertificationDTO);

        var result = this.verifyIfHasCertificationUseCase.execute(verifyIfHasCertificationDTO);
        if(result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}
