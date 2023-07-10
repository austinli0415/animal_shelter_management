package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.user.User;
import com.animalShelterManagement.demo.vaccinationType.VaccinationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Vaccination {

    @EmbeddedId
    private VaccinationKey vaccinationKey;

    private LocalDate expirationDate;

    private String vaccinationNumber;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

}
