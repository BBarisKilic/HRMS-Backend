package com.bbkdevelopment.hrms.core.adapters.concretes;

import com.bbkdevelopment.hrms.core.adapters.abstracts.EmailVerificationService;

public class EmailVerificationAdapter implements EmailVerificationService {
    @Override
    public boolean isEmailVerified() {
        return true;
    }
}
