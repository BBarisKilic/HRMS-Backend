package com.bbkdevelopment.hrms.dataAccess.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
}
