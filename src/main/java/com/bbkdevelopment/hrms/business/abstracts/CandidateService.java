package com.bbkdevelopment.hrms.business.abstracts;

import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.Result;
import com.bbkdevelopment.hrms.core.entities.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate, String secondPassword);
}
