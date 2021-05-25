package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.CandidateService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.Result;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesControllers {
    private CandidateService candidateService;

    @Autowired
    public CandidatesControllers(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/get-all")
    public DataResult<List<Candidate>> getAll() {
        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidate candidate) {
        return this.candidateService.add(candidate);
    }
}
