package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VaccinationService {

    private final VaccinationRepository vaccinationRepository;

    @Autowired
    public VaccinationService(VaccinationRepository vaccinationRepository) {
        this.vaccinationRepository = vaccinationRepository;
    }

    public List<Vaccination> getVaccinations(){return vaccinationRepository.findAll();}

    public List<Vaccination> findVaccinationsExpiredAt(int months){
        return vaccinationRepository.findByExpirationDateBetween(LocalDate.now(), LocalDate.now().plusMonths(months));
    }

    public List<Vaccination> findAllVaccinationsByPetId(Long petId){
        return vaccinationRepository.findAllVaccinationsByVaccinationKeyAnimalAnimalId(petId);
    }
}
