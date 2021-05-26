package com.bbkdevelopment.hrms.core.adapters.concretes;

import com.bbkdevelopment.hrms.core.adapters.abstracts.MernisService;
import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import com.bbkdevelopment.hrms.services.mernis.HTNKPSPublicSoap;

public class MernisAdapter implements MernisService {
    @Override
    public boolean isNationalIdValid(Candidate candidate) {
        HTNKPSPublicSoap publicSoap = new HTNKPSPublicSoap();
        try {
            if(publicSoap.TCKimlikNoDogrula(Long.valueOf(candidate.getNationalId()), candidate.getFirstName(),candidate.getLastName(), candidate.getBirthYear())){
                return true;
            } else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
