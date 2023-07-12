package com.animalShelterManagement.demo.adopt;

import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/adopt")
public class AdoptController {

    private final AdoptService adoptService;

    @Autowired
    public AdoptController(AdoptService adoptService) {
        this.adoptService = adoptService;
    }

    @GetMapping
    public List<Adopt> getAdoptionApplications(){return adoptService.getAdopts();}
}
