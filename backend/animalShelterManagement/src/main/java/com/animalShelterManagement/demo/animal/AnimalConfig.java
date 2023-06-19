package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    CommandLineRunner animalCommandLineRunner(AnimalRepository animalRepository){
        return args -> {
            Species wombat = new Species("wombat", 4);
            Species chick = new Species("chick", 2);

            Animal zhiye = new Animal(
                    "zhiye",
                    wombat);

            Animal xiaohuangji = new Animal(
                    "xiaohuang",
                    chick);

            Animal fuku = new Animal(
                    "fuku",
                    wombat);

            animalRepository.saveAll(List.of(zhiye, xiaohuangji, fuku));


        };


    }
}
