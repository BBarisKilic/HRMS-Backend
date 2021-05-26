package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.core.adapters.concretes.EmailVerificationAdapter;
import com.bbkdevelopment.hrms.core.adapters.concretes.EmployerVerifierAdapter;
import com.bbkdevelopment.hrms.dataAccess.abstracts.EmployerDao;
import com.bbkdevelopment.hrms.entities.concretes.Employer;

public class EmployerValidator extends UserValidator {
    private Employer employer;
    private EmployerDao employerDao;

    public EmployerValidator(Employer employer, EmployerDao employerDao) {
        super(employer, employerDao);
        this.employer = employer;
        this.employerDao = employerDao;
    }



    public boolean isEmailValidated() {
        return new EmailVerificationAdapter().isEmailVerified();
    }

    public boolean isEmployerVerified() {
        return new EmployerVerifierAdapter().isEmployerVerified();
    }
}
