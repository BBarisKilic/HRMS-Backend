package com.bbkdevelopment.hrms.entities.concretes;

import com.bbkdevelopment.hrms.core.entities.Employer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Entity
@Table(name = "job_advertisement")
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    @NotEmpty
    @NotBlank(message = "Employer field can not be empty!")
    private int employerId;

    @Column(name = "job_title_id")
    @NotEmpty
    @NotBlank(message = "Job title field can not be empty!")
    private int jobTitleId;

    @Column(name = "city_id")
    @NotEmpty
    @NotBlank(message = "City field can not be empty!")
    private int cityId;

    @Column(name = "job_description")
    @NotEmpty
    @NotBlank(message = "Job description field can not be empty!")
    private String jobDescription;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "number_of_open_positions")
    @NotEmpty
    @NotBlank(message = "Open positions field can not be empty!")
    private int numberOfOpenPositions;

    @Column(name = "posting_date")
    @NotEmpty
    @NotBlank(message = "Posting date field can not be empty!")
    private Date postingDate;

    @Column(name = "application_deadline")
    private Date applicationDeadline;

    @Column(name = "is_active")
    @NotEmpty
    @NotBlank(message = "Active field can not be empty!")
    private boolean isActive;
}
