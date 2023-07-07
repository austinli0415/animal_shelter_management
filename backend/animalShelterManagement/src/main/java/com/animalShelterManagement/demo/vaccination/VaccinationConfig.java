package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.animal.AnimalRepository;
import com.animalShelterManagement.demo.species.Species;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class VaccinationConfig {

    @Bean
    CommandLineRunner vaccinationCommandLineRunner(VaccinationRepository vaccinationRepository) {
        return args -> {


        };
    }
}
