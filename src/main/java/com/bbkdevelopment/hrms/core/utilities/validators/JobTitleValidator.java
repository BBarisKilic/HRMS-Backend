package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.dataAccess.abstracts.JobTitleDao;
import com.bbkdevelopment.hrms.entities.concretes.JobTitle;

public class JobTitleValidator {
    private JobTitle jobTitle;
    private JobTitleDao jobTitleDao;

    public JobTitleValidator(JobTitle jobTitle, JobTitleDao jobTitleDao) {
        this.jobTitle = jobTitle;
        this.jobTitleDao = jobTitleDao;
    }

    public boolean isJobTitleEmpty() {
        return jobTitle.getJobTitle().length() == 0;
    }

    public boolean isJobTitleAddedBefore() {
        for(JobTitle jobTitle : jobTitleDao.findAll())
            if(jobTitle.getJobTitle().equals(this.jobTitle))
                return true;
        return false;
    }
}
