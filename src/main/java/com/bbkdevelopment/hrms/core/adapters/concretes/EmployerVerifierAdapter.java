package com.bbkdevelopment.hrms.core.adapters.concretes;

import com.bbkdevelopment.hrms.core.adapters.abstracts.EmployerVerifierService;

public class EmployerVerifierAdapter implements EmployerVerifierService {
    @Override
    public boolean isEmployerVerified() {
        return true;
    }
}
