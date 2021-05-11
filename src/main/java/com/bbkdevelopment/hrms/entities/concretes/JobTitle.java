package com.bbkdevelopment.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "JobTitles")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;

    @Column(name = "JobTitle")
    private String jobTitle;

}
