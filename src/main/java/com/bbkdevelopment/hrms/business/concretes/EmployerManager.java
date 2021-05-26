package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.EmployerService;
import com.bbkdevelopment.hrms.core.utilities.results.*;
import com.bbkdevelopment.hrms.core.utilities.validators.EmployerValidator;
import com.bbkdevelopment.hrms.dataAccess.abstracts.EmployerDao;
import com.bbkdevelopment.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    private EmployerValidator employerValidator;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult(employerDao.findAll(), "Employers successfully fetched.");
    }

    @Override
    public Result add(Employer employer) {
        employerValidator = new EmployerValidator(employer, employerDao);


        if(employerValidator.isEmailUsedBefore())
            return new ErrorResult(employer.getEmail() + " used before.");
        if(!employerValidator.isEmailValidated())
            return new ErrorResult("Please validate your email: "+ employer.getEmail());
        if(!employerValidator.isEmployerVerified())
            return new ErrorResult("Your registration need to be verified by the employee first.");

        this.employerDao.save(employer);
        return new SuccessResult(employer.getCompanyName() + " successfully added.");
    }
}
