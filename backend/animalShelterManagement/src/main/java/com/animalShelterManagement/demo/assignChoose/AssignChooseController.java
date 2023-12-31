package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.adopt.Adopt;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/assignChoose")
public class AssignChooseController {

    private final AssignChooseService assignChooseService;

    @Autowired
    public AssignChooseController(AssignChooseService assignChooseService) {
        this.assignChooseService = assignChooseService;
    }

    @GetMapping
    public List<AssignChoose> getAssignChooses(){return assignChooseService.getAssignChooses();}

    @GetMapping(path = "AnimalIdGrouped")
    public AnimalBreed findByAnimalIdGrouped(@PathParam("animalId") Long animalId){
        return assignChooseService.findByAnimalIdGrouped(animalId);
    }

}
