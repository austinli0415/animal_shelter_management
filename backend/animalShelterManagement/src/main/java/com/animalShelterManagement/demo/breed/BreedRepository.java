package com.animalShelterManagement.demo.breed;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed, BreedKey> {
}
