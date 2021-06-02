package com.bbkdevelopment.hrms.core.dataAccess;

import com.bbkdevelopment.hrms.core.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
