package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.CandidateService;
import com.bbkdevelopment.hrms.core.utilities.results.*;
import com.bbkdevelopment.hrms.core.utilities.validators.CandidateValidator;
import com.bbkdevelopment.hrms.dataAccess.abstracts.CandidateDao;
import com.bbkdevelopment.hrms.dataAccess.abstracts.UserDao;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager extends UserManager implements CandidateService {
    private CandidateDao candidateDao;
    private CandidateValidator candidateValidator;

    @Autowired
    public CandidateManager(CandidateDao candidateDao, UserDao userDao) {
        super(userDao);
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult(candidateDao.findAll(), "Candidates successfully fetched.");
    }

    @Override
    public Result add(Candidate candidate, String secondPassword) {
        candidateValidator = new CandidateValidator(candidate, candidateDao, userDao);

        if(candidateValidator.isEmailUsedBefore())
            return new ErrorResult(candidate.getEmail() + " used before.");
        if(candidateValidator.isNationalIdUsedBefore())
            return new ErrorResult(candidate.getNationalId() + " used before.");
        if(!candidateValidator.isNationalIdValid())
            return new ErrorResult(candidate.getNationalId() + " is not valid.");
        if(!candidateValidator.isEmailValidated())
            return new ErrorResult("Please validate your email: " + candidate.getEmail());

        this.candidateDao.save(candidate);
        return new SuccessResult(candidate.getLastName() + " successfully added.");
    }
}
