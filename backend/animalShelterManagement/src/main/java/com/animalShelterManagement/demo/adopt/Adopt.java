package com.animalShelterManagement.demo.adopt;

import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplication;
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
public class Adopt {

    @EmbeddedId
    private AdoptKey adoptKey;

    private float adoptionFee;
    private LocalDate adoptionDate;

}
