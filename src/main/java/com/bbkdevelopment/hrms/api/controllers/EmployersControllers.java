package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.EmployerService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
    EmployerService employerService;

    @Autowired
    public EmployersControllers(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("get-all")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }
}
