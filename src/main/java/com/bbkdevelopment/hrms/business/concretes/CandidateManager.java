package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.CandidateService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.Result;
import com.bbkdevelopment.hrms.core.utilities.results.SuccessDataResult;
import com.bbkdevelopment.hrms.core.utilities.results.SuccessResult;
import com.bbkdevelopment.hrms.dataAccess.abstracts.CandidateDao;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult(candidateDao.findAll(), "Candidates successfully fetched.");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult(candidate.getLastName() + "successfully added.");
    }
}
