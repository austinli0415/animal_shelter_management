package com.animalShelterManagement.demo.animal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository animalRepository){
        return args -> {
            Animal zhiye = new Animal(
              "zhiye"
            );

            Animal fuku = new Animal(
                    "fuku"
            );

            animalRepository.saveAll(List.of(zhiye, fuku));
        };


    }
}
