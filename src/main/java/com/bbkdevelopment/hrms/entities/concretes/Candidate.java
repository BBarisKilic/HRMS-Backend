package com.bbkdevelopment.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Candidate extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @NotEmpty
    @NotBlank(message = "First name can not be empty!")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    @NotBlank(message = "Last name can not be empty!")
    private String lastName;

    @Column(name = "national_id")
    @NotEmpty
    @NotBlank(message = "National id can not be empty!")
    private String nationalId;

    @Column(name = "birth_year")
    private int birthYear;
}
