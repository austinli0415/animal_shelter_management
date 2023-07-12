package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/volunteerWork")
public class VolunteerWorkController {

    private final VolunteerWorkService volunteerWorkService;

    @Autowired
    public VolunteerWorkController(VolunteerWorkService volunteerWorkService) {
        this.volunteerWorkService = volunteerWorkService;
    }

    @GetMapping
    public List<VolunteerWork> getVolunteerWorks(){return volunteerWorkService.getVolunteerWorks();}
}
