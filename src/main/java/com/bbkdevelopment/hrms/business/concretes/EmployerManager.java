package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.EmployerService;
import com.bbkdevelopment.hrms.core.utilities.results.*;
import com.bbkdevelopment.hrms.core.utilities.validators.EmployerValidator;
import com.bbkdevelopment.hrms.core.dataAccess.EmployerDao;
import com.bbkdevelopment.hrms.core.dataAccess.UserDao;
import com.bbkdevelopment.hrms.core.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager extends UserManager implements EmployerService {
    private EmployerDao employerDao;
    private EmployerValidator employerValidator;

    @Autowired
    public EmployerManager(EmployerDao employerDao, UserDao userDao) {
        super(userDao);
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult(employerDao.findAll(), "Employers successfully fetched.");
    }

    @Override
    public Result add(Employer employer, String secondPassword) {
        employerValidator = new EmployerValidator(employer, employerDao, userDao);

        if(!employerValidator.isWebAndEmailDomainMatch())
            return new ErrorResult(employer.getEmail() + " and " + employer.getWebAddress() + " are not matching!");
        if(employerValidator.isEmailUsedBefore())
            return new ErrorResult(employer.getEmail() + " used before.");
        if(!employerValidator.isEmailValidated())
            return new ErrorResult("Please validate your email: " + employer.getEmail());
        if(!employerValidator.isEmployerVerified())
            return new ErrorResult("Your registration need to be verified by the employee first.");

        this.employerDao.save(employer);
        return new SuccessResult(employer.getCompanyName() + " successfully added.");
    }
}
