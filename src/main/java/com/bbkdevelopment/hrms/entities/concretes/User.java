package com.bbkdevelopment.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String email;
    private String password;
}