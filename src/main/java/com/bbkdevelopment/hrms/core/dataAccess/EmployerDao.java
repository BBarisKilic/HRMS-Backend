package com.bbkdevelopment.hrms.core.dataAccess;

import com.bbkdevelopment.hrms.core.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
