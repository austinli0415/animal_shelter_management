package com.animalShelterManagement.demo.adoptionApplicant;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/adoptionApplicant")
public class AdoptionApplicantController {

    private final AdoptionApplicantService adoptionApplicantService;

    @Autowired
    public AdoptionApplicantController(AdoptionApplicantService adoptionApplicantService) {
        this.adoptionApplicantService = adoptionApplicantService;
    }

    @GetMapping
    public List<AdoptionApplicant> getAdoptionApplicants(){return adoptionApplicantService.getAdoptionApplicant();}
}
