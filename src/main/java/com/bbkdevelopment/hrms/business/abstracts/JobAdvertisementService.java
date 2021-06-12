package com.bbkdevelopment.hrms.business.abstracts;

import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive);
}
