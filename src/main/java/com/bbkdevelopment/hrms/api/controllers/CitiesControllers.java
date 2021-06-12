package com.bbkdevelopment.hrms.api.controllers;

import com.bbkdevelopment.hrms.business.abstracts.CityService;
import com.bbkdevelopment.hrms.core.utilities.results.DataResult;
import com.bbkdevelopment.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CitiesControllers {
    private CityService cityService;

    @Autowired
    public CitiesControllers(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/get-all")
    public DataResult<List<City>> getAll() {
        return this.cityService.getAll();
    }
}
