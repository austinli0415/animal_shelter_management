package com.animalShelterManagement.demo.adopt;

import com.animalShelterManagement.demo.adoptionApplication.AdoptionApplication;
import com.animalShelterManagement.demo.animal.Animal;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AdoptKey implements Serializable {

    @OneToOne
    @JoinColumn(name = "petId", referencedColumnName = "petId")
    private Animal animal;

    @OneToOne
    @JoinColumn(name = "applicationId", referencedColumnName = "applicationId")
    private AdoptionApplication adoptionApplication;
}
