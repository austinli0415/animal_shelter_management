package com.animalShelterManagement.demo.adoptionApplication;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionApplicationService {

    private final AdoptionApplicationRepository adoptionApplicationRepository;

    public AdoptionApplicationService(AdoptionApplicationRepository adoptionApplicationRepository) {
        this.adoptionApplicationRepository = adoptionApplicationRepository;
    }

    public List<AdoptionApplication> getAdoptionApplications() {
        return adoptionApplicationRepository.findAll();
    }
}
