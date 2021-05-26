package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.JobTitleService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.Result;
import com.bbkdevelopment.hrms.entities.concretes.JobTitle;
import com.bbkdevelopment.hrms.entities.concretes.RequestBodyEmployer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-titles")
public class JobTitlesControllers {
    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesControllers(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/get-all")
    public DataResult<List<JobTitle>> getAll(){
        return this.jobTitleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle) {
        return this.jobTitleService.add(jobTitle);
    }
}
