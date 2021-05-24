package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.EmployerService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.SuccessDataResult;
import com.bbkdevelopment.hrms.dataAccess.abstracts.EmployerDao;
import com.bbkdevelopment.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult(employerDao.findAll(), "Employers successfully fetched.");
    }
}
