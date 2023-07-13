package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Optional<Animal> findAnimalByName(String name);

    List<Animal> findAllAnimalsBySpeciesSpeciesName(String speciesName);

    List<Animal> findBySurrenderDateAfter(@Param("monthsBeforeDate") LocalDate monthsBeforeDate);

    int countBySurrenderDateAfter(@Param("monthsBeforeDate") LocalDate monthsBeforeDate);

}
