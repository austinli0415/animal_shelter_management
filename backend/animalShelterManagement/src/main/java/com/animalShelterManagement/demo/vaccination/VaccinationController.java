package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/vaccination")
public class VaccinationController {

    private final VaccinationService vaccinationService;

    @Autowired
    public VaccinationController(VaccinationService vaccinationService) {
        this.vaccinationService = vaccinationService;
    }

    @GetMapping
    public List<Vaccination> getVaccinations(){return vaccinationService.getVaccinations();}

    @GetMapping(path = "/vaccinationByPetId")
    public List<Vaccination> findAllVaccinationsByPetId(@PathParam("petId") Long petId){
        return vaccinationService.findAllVaccinationsByPetId(petId);
    }

}
