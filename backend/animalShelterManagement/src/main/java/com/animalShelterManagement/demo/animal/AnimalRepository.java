package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Optional<Animal> findAnimalByName(String name);

    List<Animal> findAllAnimalsBySpeciesId(Long id);

    List<Animal> findAllAnimalsBySpeciesName(String speciesName);

}
