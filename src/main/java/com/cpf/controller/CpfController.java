package com.cpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.cpf.service.CpfService;

@RestController
public class CpfController {

    @Autowired
    private CpfService cpfService;

    @RequestMapping("/")
    String index() {
        return "CPF - VALIDATOR";
    }
    
    
    @CrossOrigin
    @PostMapping(path = "/validar")
    public void validate(@RequestBody String cpf) {
        cpfService.validateCPF(cpf);
    }
}
