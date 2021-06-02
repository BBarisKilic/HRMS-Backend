package com.bbkdevelopment.hrms.business.abstracts;

import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.Result;
import com.bbkdevelopment.hrms.core.entities.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer Employer, String secondPassword);
}
