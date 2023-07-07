package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import com.animalShelterManagement.demo.user.Role;
import com.animalShelterManagement.demo.user.User;
import com.animalShelterManagement.demo.user.UserRepository;
import com.animalShelterManagement.demo.vaccination.Vaccination;
import com.animalShelterManagement.demo.vaccination.VaccinationKey;
import com.animalShelterManagement.demo.vaccination.VaccinationRepository;
import com.animalShelterManagement.demo.vaccinationType.VaccinationType;
import com.animalShelterManagement.demo.vaccinationType.VaccinationTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class AnimalConfig {

    @Bean
    CommandLineRunner animalCommandLineRunner(AnimalRepository animalRepository,
                                              VaccinationRepository vaccinationRepository,
                                              VaccinationTypeRepository vaccinationTypeRepository,
                                              UserRepository userRepository){
        return args -> {

            User tRex = new User("t", "Rex", "tRex@wuyueshan.org", "1234", Role.EMPLOYEE);

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


            VaccinationType bordetella = new VaccinationType("Bordetella");
            VaccinationKey k1 = new VaccinationKey(zhiye, bordetella, LocalDate.now());
            Vaccination v1 = new Vaccination(k1, LocalDate.now().plusDays(100), "2hjk", tRex);


            userRepository.saveAll(List.of(tRex));
            animalRepository.saveAll(List.of(zhiye, xiaohuangji, fuku));
            vaccinationTypeRepository.saveAll(List.of(bordetella));
            vaccinationRepository.saveAll(List.of(v1));


        };


    }
}
