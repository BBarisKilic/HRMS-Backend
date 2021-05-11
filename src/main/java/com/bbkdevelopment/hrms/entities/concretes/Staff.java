package com.bbkdevelopment.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="Staffs")
public class Staff extends User {

    @Id
    @Column(name = "UserId")
    private int userId;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "NationalId")
    private String nationalId;

    @Column(name = "YearOfBirth")
    private Date yearOfBirth;
}
