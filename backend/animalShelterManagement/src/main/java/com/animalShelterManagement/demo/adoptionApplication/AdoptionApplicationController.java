package com.animalShelterManagement.demo.adoptionApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/adoptionApplication")
public class AdoptionApplicationController {

    private final AdoptionApplicationService adoptionApplicationService;

    @Autowired
    public AdoptionApplicationController(AdoptionApplicationService adoptionApplicationService) {
        this.adoptionApplicationService = adoptionApplicationService;
    }

    @GetMapping
    public List<AdoptionApplication> getAdoptionApplications(){return adoptionApplicationService.getAdoptionApplications();}
}
