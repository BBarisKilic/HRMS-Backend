package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.core.adapters.concretes.EmailVerificationAdapter;
import com.bbkdevelopment.hrms.core.adapters.concretes.MernisAdapter;
import com.bbkdevelopment.hrms.dataAccess.abstracts.CandidateDao;
import com.bbkdevelopment.hrms.dataAccess.abstracts.UserDao;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;

public class CandidateValidator extends UserValidator{
    private Candidate candidate;
    private CandidateDao candidateDao;

    public CandidateValidator(Candidate candidate, CandidateDao candidateDao, UserDao userDao) {
        super(candidate, userDao);
        this.candidate = candidate;
        this.candidateDao = candidateDao;
    }

    public boolean isNationalIdUsedBefore() {
        for(Candidate candidate : candidateDao.findAll()){
            if(candidate.getNationalId().equals(this.candidate.getNationalId())) {
                return true;
            }
        }
       return false;
    }

    public boolean isNationalIdValid() {
        return new MernisAdapter().isNationalIdValid(candidate);
    }

    public boolean isEmailValidated() {
        return new EmailVerificationAdapter().isEmailVerified();
    }
}
