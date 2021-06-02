package com.bbkdevelopment.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    @NotEmpty
    @NotBlank(message = "City name can not be empty!")
    private String city_name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
