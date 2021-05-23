package com.bbkdevelopment.hrms.dataAccess.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
