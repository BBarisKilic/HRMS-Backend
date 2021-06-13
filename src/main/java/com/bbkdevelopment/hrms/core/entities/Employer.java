package com.bbkdevelopment.hrms.core.entities;

import com.bbkdevelopment.hrms.core.entities.User;
import com.bbkdevelopment.hrms.entities.concretes.JobAdvertisement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    @NotEmpty
    @NotBlank(message = "Company name can not be empty!")
    private String companyName;

    @Column(name = "web_address")
    @NotEmpty
    @NotBlank(message = "Web address can not be empty!")
    private String webAddress;

    @Column(name = "phone_number")
    @NotEmpty
    @NotBlank(message = "Phone number can not be empty!")
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;
}
