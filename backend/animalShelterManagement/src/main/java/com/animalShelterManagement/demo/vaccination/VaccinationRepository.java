package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VaccinationRepository extends JpaRepository<Vaccination, VaccinationKey> {
    List<Vaccination> findAllVaccinationsByVaccinationKeyAnimalAnimalId(Long petId);

    List<Vaccination> findByExpirationDateBetween(LocalDate now, LocalDate next);
}
