package com.bbkdevelopment.hrms.business.concretes;

import com.bbkdevelopment.hrms.business.abstracts.JobAdvertisementService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.core.utilities.results.SuccessDataResult;
import com.bbkdevelopment.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult(jobAdvertisementDao.findAll(), "Job advertisements successfully fetched.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
        return new SuccessDataResult(jobAdvertisementDao.getByIsActive(isActive), "Active job advertisements successfully fetched.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getSortByIsActive(boolean isActive) {
        Sort sort = Sort.by(Sort.Direction.DESC, "postingDate");
        return new SuccessDataResult(jobAdvertisementDao.getSortByIsActive(isActive, sort), "Sorted active job advertisements successfully fetched.");
    }
}
