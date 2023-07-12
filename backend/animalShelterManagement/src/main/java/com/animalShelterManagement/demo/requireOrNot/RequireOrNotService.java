package com.animalShelterManagement.demo.requireOrNot;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequireOrNotService {

    private final RequireOrNotRepository requireOrNotRepository;

    @Autowired
    public RequireOrNotService(RequireOrNotRepository requireOrNotRepository) {
        this.requireOrNotRepository = requireOrNotRepository;
    }

    public List<RequireOrNot> getRequireOrNots() {
        return requireOrNotRepository.findAll();
    }
}
