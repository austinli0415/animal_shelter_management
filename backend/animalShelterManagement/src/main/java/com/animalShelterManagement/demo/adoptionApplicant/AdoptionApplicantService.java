package com.animalShelterManagement.demo.adoptionApplicant;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptionApplicantService {

    private final AdoptionApplicantRepository adoptionApplicantRepository;

    @Autowired
    public AdoptionApplicantService(AdoptionApplicantRepository adoptionApplicantRepository) {
        this.adoptionApplicantRepository = adoptionApplicantRepository;
    }

    public List<AdoptionApplicant> getAdoptionApplicant() {
        return adoptionApplicantRepository.findAll();
    }
}
