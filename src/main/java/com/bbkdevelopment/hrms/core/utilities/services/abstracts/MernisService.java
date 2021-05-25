package com.bbkdevelopment.hrms.core.utilities.services.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.Candidate;

public interface MernisService {
    boolean isNationalIdValid(Candidate candidate);
}
