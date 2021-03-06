package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.JobAdvertisementService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job-advertisements")
public class JobAdvertisementsControllers {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsControllers(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/get-all")
    private DataResult<List<JobAdvertisement>> getAll() {
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/get-all-active-job-advertisements")
    private DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisements() {
        return this.jobAdvertisementService.getAllActiveJobAdvertisements();
    }

    @GetMapping("/get-all-active-job-advertisements-and-sort-by-posting-date")
    private DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisementsAndSortByPostingDate() {
        return this.jobAdvertisementService.getAllActiveJobAdvertisementsAndSortByPostingDate();
    }

    @GetMapping("/get-all-active-job-advertisements-by-employer")
    private DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisementsByEmployer(@RequestParam int employerId) {
        return this.jobAdvertisementService.getAllActiveJobAdvertisementsByEmployer(employerId);
    }
}
