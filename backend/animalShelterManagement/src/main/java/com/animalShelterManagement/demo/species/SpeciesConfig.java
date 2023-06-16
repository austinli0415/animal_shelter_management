package com.animalShelterManagement.demo.species;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.animal.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpeciesConfig {
    @Bean
    CommandLineRunner speciesCommandLineRunner(SpeciesRepository speciesRepository) {
        return args -> {
            Species wombat = new Species(
                    "wombat",
                    4
            );

            Species chick = new Species(
                    "chick",
                    2
            );

            speciesRepository.saveAll(List.of(wombat, chick));
        };
    }
}
