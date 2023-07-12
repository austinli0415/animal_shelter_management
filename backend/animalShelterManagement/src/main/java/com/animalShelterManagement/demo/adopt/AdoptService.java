package com.animalShelterManagement.demo.adopt;

import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptService {

    private final AdoptRepository adoptRepository;

    @Autowired
    public AdoptService(AdoptRepository adoptRepository) {
        this.adoptRepository = adoptRepository;
    }

    public List<Adopt> getAdopts() {
        return adoptRepository.findAll();
    }
}
