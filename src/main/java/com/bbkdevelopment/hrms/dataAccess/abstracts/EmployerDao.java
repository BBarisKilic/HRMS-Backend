package com.bbkdevelopment.hrms.dataAccess.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
}
