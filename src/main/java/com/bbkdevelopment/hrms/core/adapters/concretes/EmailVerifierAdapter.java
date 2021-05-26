package com.bbkdevelopment.hrms.core.adapters.concretes;

import com.bbkdevelopment.hrms.core.adapters.abstracts.EmailVerifierService;

public class EmailVerifierAdapter implements EmailVerifierService {
    @Override
    public boolean isEmailVerified() {
        return true;
    }
}
