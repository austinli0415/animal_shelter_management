package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.breed.Breed;
import com.animalShelterManagement.demo.breed.BreedKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AssignChooseKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "animalId", referencedColumnName = "animalId")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "breedName", referencedColumnName = "breedName")
    private Breed breed;

    /*
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "breedName", referencedColumnName = "breedName"),
            //@JoinColumn(name = "speciesName", referencedColumnName = "speciesName")
    })
    private Breed breed;

     */

}
