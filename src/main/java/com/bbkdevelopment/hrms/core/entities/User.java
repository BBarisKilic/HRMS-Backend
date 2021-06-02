package com.bbkdevelopment.hrms.core.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @Email(message = "Enter a valid email!")
    @NotEmpty
    @NotBlank(message = "Email can not be empty!")
    private String email;

    @Column(name = "password")
    @NotEmpty
    @NotBlank(message = "Password can not be empty!")
    private String password;
}