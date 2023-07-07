package com.animalShelterManagement.demo.adoptionApplication;

import com.animalShelterManagement.demo.adoptionApplicant.AdoptionApplicant;
import com.animalShelterManagement.demo.animal.Animal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionApplication {
    @Id
    @GeneratedValue
    private Long id;

    private String coApplicantFirstName;
    private String coApplicantLastName;
    private LocalDate dateOfApplication;
    private String applicationState;

    @ManyToOne
    @JoinColumn(name = "email", referencedColumnName = "email")
    private AdoptionApplicant adoptionApplicant;
}
