package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.core.adapters.concretes.EmailVerifierAdapter;
import com.bbkdevelopment.hrms.core.adapters.concretes.EmployerVerifierAdapter;
import com.bbkdevelopment.hrms.core.dataAccess.EmployerDao;
import com.bbkdevelopment.hrms.core.dataAccess.UserDao;
import com.bbkdevelopment.hrms.core.entities.Employer;

public class EmployerValidator extends UserValidator {
    private Employer employer;
    private EmployerDao employerDao;

    public EmployerValidator(Employer employer, EmployerDao employerDao, UserDao userDao) {
        super(employer, userDao);
        this.employer = employer;
        this.employerDao = employerDao;
    }

    private String getWebDomain(String webAddress) {
        return webAddress.startsWith("www.") ? webAddress.substring(4) : webAddress;
    }

    private String getEmailDomain(String email) {
        return email.substring(email.lastIndexOf("@") + 1);
    }

    public boolean isWebAndEmailDomainMatch() {
        String webDomain = getWebDomain(employer.getWebAddress());
        String emailDomain = getEmailDomain(employer.getEmail());
        return webDomain.equals(emailDomain);
    }

    public boolean isEmailValidated() {
        return new EmailVerifierAdapter().isEmailVerified();
    }

    public boolean isEmployerVerified() {
        return new EmployerVerifierAdapter().isEmployerVerified();
    }
}
