package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.JobTitleService;
import com.bbkdevelopment.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }
}
