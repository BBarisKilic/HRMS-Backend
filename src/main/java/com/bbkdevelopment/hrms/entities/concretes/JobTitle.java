package com.bbkdevelopment.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_titles")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "job_title")
    private String jobTitle;

}
