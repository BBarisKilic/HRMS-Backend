package com.bbkdevelopment.hrms.core.utilities.services.concretes;

import com.bbkdevelopment.hrms.core.utilities.services.abstracts.EmailVerificationService;

public class EmailVerificationAdapter implements EmailVerificationService {
    @Override
    public boolean isEmailVerified() {
        return true;
    }
}
