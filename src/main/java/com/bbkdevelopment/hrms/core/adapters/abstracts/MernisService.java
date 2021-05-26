package com.bbkdevelopment.hrms.core.adapters.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.Candidate;

public interface MernisService {
    boolean isNationalIdValid(Candidate candidate);
}
