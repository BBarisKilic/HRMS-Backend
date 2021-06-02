package com.bbkdevelopment.hrms.core.adapters.abstracts;

import com.bbkdevelopment.hrms.core.entities.Candidate;

public interface MernisService {
    boolean isNationalIdValid(Candidate candidate);
}
