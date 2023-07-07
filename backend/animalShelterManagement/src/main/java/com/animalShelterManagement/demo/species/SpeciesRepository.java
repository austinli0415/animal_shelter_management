package com.animalShelterManagement.demo.species;

import com.animalShelterManagement.demo.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, String> {

}
