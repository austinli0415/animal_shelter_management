package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.adopt.Adopt;
import com.animalShelterManagement.demo.adopt.AdoptRepository;
import com.animalShelterManagement.demo.adoptionApplicant.AdoptionApplicant;
import com.animalShelterManagement.demo.adoptionApplicant.AdoptionApplicantRepository;
import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplication;
import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplicationRepository;
import com.animalShelterManagement.demo.assignChoose.AssignChoose;
import com.animalShelterManagement.demo.assignChoose.AssignChooseKey;
import com.animalShelterManagement.demo.assignChoose.AssignChooseRepository;
import com.animalShelterManagement.demo.breed.Breed;
import com.animalShelterManagement.demo.breed.BreedKey;
import com.animalShelterManagement.demo.breed.BreedRepository;
import com.animalShelterManagement.demo.requireOrNot.RequireOrNot;
import com.animalShelterManagement.demo.requireOrNot.RequireOrNotKey;
import com.animalShelterManagement.demo.requireOrNot.RequireOrNotRepository;
import com.animalShelterManagement.demo.species.Species;
import com.animalShelterManagement.demo.species.SpeciesRepository;
import com.animalShelterManagement.demo.species.SpeciesService;
import com.animalShelterManagement.demo.user.Role;
import com.animalShelterManagement.demo.user.User;
import com.animalShelterManagement.demo.user.UserRepository;
import com.animalShelterManagement.demo.vaccination.Vaccination;
import com.animalShelterManagement.demo.vaccination.VaccinationKey;
import com.animalShelterManagement.demo.vaccination.VaccinationRepository;
import com.animalShelterManagement.demo.vaccinationType.VaccinationType;
import com.animalShelterManagement.demo.vaccinationType.VaccinationTypeRepository;
import com.animalShelterManagement.demo.volunteerWork.VolunteerWork;
import com.animalShelterManagement.demo.volunteerWork.VolunteerWorkKey;
import com.animalShelterManagement.demo.volunteerWork.VolunteerWorkRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
                                              SpeciesRepository speciesRepository,
                                              VaccinationRepository vaccinationRepository,
                                              VaccinationTypeRepository vaccinationTypeRepository,
                                              UserRepository userRepository,
                                              VolunteerWorkRepository volunteerWorkRepository,
                                              AdoptionApplicantRepository adoptionApplicantRepository,
                                              AdoptionApplicationRepository adoptionApplicationRepository,
                                              BreedRepository breedRepository,
                                              AssignChooseRepository assignChooseRepository,
                                              RequireOrNotRepository requireOrNotRepository,
                                              AdoptRepository adoptRepository){
        return args -> {
            /*
            User tRex = new User("tRex","t", "Rex", "tRex@wuyueshan.org", "1234", "688932", Role.EMPLOYEE);
            User volunteer = new User("vo", "v", "teer", "vt@wuyueshan.org", "124", "697", Role.VOLUNTEER);

            VolunteerWorkKey vk1 = new VolunteerWorkKey(volunteer, LocalDate.now());
            VolunteerWork volunteerWork = new VolunteerWork(vk1, 3);

            Species wombat = new Species("wombat", 4);
            Species chick = new Species("chick", 2);

            BreedKey breedKey = new BreedKey("Common wombat", wombat);
            Breed breed = new Breed(breedKey);

            Animal zhiye = new Animal(
                    "zhiye",
                    wombat);
            Animal xiaohuangji = new Animal(
                    "xiaohuang",
                    chick);
            Animal fuku = new Animal(
                    "fuku",
                    wombat);
            Animal wine = new Animal("wine", "male", "none", 300, "oldest wombat in the world", "1", "none", LocalDate.of(1989, 1, 1), "no", tRex, wombat);

            AssignChooseKey assignChooseKey = new AssignChooseKey(wine, breed);
            AssignChoose assignChoose = new AssignChoose(assignChooseKey);

            VaccinationType bordetella = new VaccinationType("Bordetella");
            VaccinationKey k1 = new VaccinationKey(zhiye, bordetella, LocalDate.now());
            Vaccination v1 = new Vaccination(k1, LocalDate.now().plusDays(100), "2hjk", tRex);

            RequireOrNotKey requireOrNotKey = new RequireOrNotKey(wombat, bordetella);
            RequireOrNot requireOrNot = new RequireOrNot(requireOrNotKey, "No");

            AdoptionApplicant adoptionApplicant = new AdoptionApplicant("21@g.com", "2", "1", "43", "Plano", "Garda", "Texas", "423");
            AdoptionApplication adoptionApplication = new AdoptionApplication(1L, "2", "2", LocalDate.of(2023, 1,1), "pending", adoptionApplicant);

            Adopt adopt = new Adopt(1L, fuku, adoptionApplication, 100, LocalDate.of(2006, 5, 12));

            userRepository.saveAll(List.of(tRex, volunteer));
            volunteerWorkRepository.saveAll(List.of(volunteerWork));

            speciesRepository.saveAll(List.of(wombat, chick));
            breedRepository.saveAll(List.of(breed));
            animalRepository.saveAll(List.of(zhiye, xiaohuangji, fuku, wine));
            assignChooseRepository.saveAll(List.of(assignChoose));

            adoptionApplicantRepository.saveAll(List.of(adoptionApplicant));
            adoptionApplicationRepository.saveAll(List.of(adoptionApplication));
            adoptRepository.saveAll(List.of(adopt));

            vaccinationTypeRepository.saveAll(List.of(bordetella));
            vaccinationRepository.saveAll(List.of(v1));
            requireOrNotRepository.saveAll(List.of(requireOrNot));

             */

        };
    }
}
