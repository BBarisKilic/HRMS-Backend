package com.bbkdevelopment.hrms.business.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
