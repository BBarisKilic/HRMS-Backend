package com.bbkdevelopment.hrms.dataAccess.abstracts;

import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
    List<JobAdvertisement> getByIsActive(boolean isActive);

    List<JobAdvertisement> getSortByIsActive(boolean isActive, Sort sort);

    @Query("From JobAdvertisement where isActive=:isActive and employer.id=:employerId")
    List<JobAdvertisement> getByIsActiveAndEmployerId(boolean isActive, int employerId);
}
