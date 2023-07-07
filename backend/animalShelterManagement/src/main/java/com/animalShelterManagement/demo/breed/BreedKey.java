package com.animalShelterManagement.demo.breed;

import com.animalShelterManagement.demo.species.Species;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class BreedKey implements Serializable {

    private String breedName;

    @ManyToOne
    @JoinColumn(name = "speciesName", referencedColumnName = "name")
    private Species species;
}
