package com.animalShelterManagement.demo.breed;

import com.animalShelterManagement.demo.species.Species;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Breed {

    @EmbeddedId
    private BreedKey breedKey;

}
