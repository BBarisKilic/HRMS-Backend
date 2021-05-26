package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.dataAccess.abstracts.CandidateDao;
import com.bbkdevelopment.hrms.dataAccess.abstracts.EmployerDao;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import com.bbkdevelopment.hrms.entities.concretes.Employer;
import com.bbkdevelopment.hrms.entities.concretes.User;

public class UserValidator {
    private User user;
    private CandidateDao candidateDao;
    private EmployerDao employerDao;

    public UserValidator(User user){
        this.user = user;
    }

    public UserValidator(User user, CandidateDao candidateDao){
        this(user);
        this.candidateDao = candidateDao;
    }

    public UserValidator(User user, EmployerDao employerDao){
        this(user);
        this.employerDao = employerDao;
    }

    public boolean isEmailUsedBefore() {
        if (candidateDao != null) {
            for(Candidate candidate : candidateDao.findAll()){
                if( candidate.getEmail().equals(user.getEmail())){
                    return true;
                }
            }
            return false;
        } else if(employerDao != null){
            for(Employer Employer : employerDao.findAll()){
                if( Employer.getEmail().equals(user.getEmail())){
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
