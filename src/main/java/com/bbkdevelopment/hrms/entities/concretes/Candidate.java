package com.bbkdevelopment.hrms.entities.concretes;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="candidates")
public class Candidate extends User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "year_of_birth")
    private Date yearOfBirth;

    public Candidate(int id, String email, String password, String firstName, String lastName, String nationalId, Date yearOfBirth) {
        super(id, email, password);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
    }
}
