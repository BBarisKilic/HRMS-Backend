package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.JobTitleService;
import com.bbkdevelopment.hrms.core.utilities.results.*;
import com.bbkdevelopment.hrms.core.utilities.validators.JobTitleValidator;
import com.bbkdevelopment.hrms.dataAccess.abstracts.JobTitleDao;
import com.bbkdevelopment.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;
    private JobTitleValidator jobTitleValidator;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult(jobTitleDao.findAll(), "Job titles successfully fetched.");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        jobTitleValidator = new JobTitleValidator(jobTitle, jobTitleDao);

        if(jobTitleValidator.isJobTitleEmpty())
            return new ErrorResult("Job title can not be empty!");
        if(jobTitleValidator.isJobTitleAddedBefore())
            return new ErrorResult("Job title can not be empty!");

        return new SuccessResult(jobTitle.getJobTitle() + " successfully added.");
    }
}
