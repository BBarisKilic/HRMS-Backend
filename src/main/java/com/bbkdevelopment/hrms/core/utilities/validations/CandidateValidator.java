package com.bbkdevelopment.hrms.core.utilities.validations;


import com.bbkdevelopment.hrms.dataAccess.abstracts.CandidateDao;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;

public class CandidateValidator extends UserValidator{
    private Candidate candidate;
    private CandidateDao candidateDao;

    public CandidateValidator(Candidate candidate, CandidateDao candidateDao) {
        super(candidate, candidateDao);
        this.candidate = candidate;
        this.candidateDao = candidateDao;
    }

    public boolean isNationalIdUsedBefore() {
        for(Candidate candidate : candidateDao.findAll()){
            if(candidate.getNationalId().equals(candidate.getNationalId())) {
                return true;
            }
        }
       return false;
    }
}
