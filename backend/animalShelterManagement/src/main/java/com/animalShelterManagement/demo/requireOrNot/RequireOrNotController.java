package com.animalShelterManagement.demo.requireOrNot;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/requireOrNot")
public class RequireOrNotController {

    private final RequireOrNotService requireOrNotService;

    @Autowired
    public RequireOrNotController(RequireOrNotService requireOrNotService) {
        this.requireOrNotService = requireOrNotService;
    }

    @GetMapping
    public List<RequireOrNot> getRequireOrNots(){return requireOrNotService.getRequireOrNots();}
}
