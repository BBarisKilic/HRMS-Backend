package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.entities.concretes.JobTitle;

public class JobTitleValidator {
    private JobTitle jobTitle;

    public JobTitleValidator(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isJobTitleEmpty() {
        return jobTitle.getJobTitle().length() == 0;
    }
}
