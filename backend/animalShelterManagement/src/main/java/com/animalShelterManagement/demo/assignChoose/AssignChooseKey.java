package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.breed.Breed;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AssignChooseKey implements Serializable {

    @OneToOne
    @JoinColumn(name = "petId", referencedColumnName = "id")
    private Animal animal;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "breedName", referencedColumnName = "breedName"),
            @JoinColumn(name = "speciesName", referencedColumnName = "speciesName")
    })
    private Breed breed;

}
