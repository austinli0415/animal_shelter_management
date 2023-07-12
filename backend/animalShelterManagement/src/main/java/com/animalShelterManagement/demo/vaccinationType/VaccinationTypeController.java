package com.animalShelterManagement.demo.vaccinationType;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/vaccinationType")
public class VaccinationTypeController {

    private final VaccinationTypeService vaccinationTypeService;

    @Autowired
    public VaccinationTypeController(VaccinationTypeService vaccinationTypeService) {
        this.vaccinationTypeService = vaccinationTypeService;
    }

    @GetMapping
    public List<VaccinationType> getVaccinationTypes(){return vaccinationTypeService.getVaccinationTypes();}
}
