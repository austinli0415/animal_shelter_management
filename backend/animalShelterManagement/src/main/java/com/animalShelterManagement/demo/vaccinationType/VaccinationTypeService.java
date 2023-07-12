package com.animalShelterManagement.demo.vaccinationType;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationTypeService {

    private final VaccinationTypeRepository vaccinationTypeRepository;

    @Autowired
    public VaccinationTypeService(VaccinationTypeRepository vaccinationTypeRepository) {
        this.vaccinationTypeRepository = vaccinationTypeRepository;
    }

    public List<VaccinationType> getVaccinationTypes() {
        return vaccinationTypeRepository.findAll();
    }


}
