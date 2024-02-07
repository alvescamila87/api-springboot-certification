package com.camila.springbootcertificationnlw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certification")
public class TestController {

    @GetMapping("/search")
    public Usuario getCertification() {
        var usuario = new Usuario("Camila", 36);
        return usuario;
    }

    @PostMapping("/create")
    public String postCertification() {
        return "FirstPost!";
    }

    record Usuario(String name, int age) {}
}
