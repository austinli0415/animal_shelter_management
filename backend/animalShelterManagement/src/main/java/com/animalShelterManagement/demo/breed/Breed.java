package com.animalShelterManagement.demo.breed;

import com.animalShelterManagement.demo.assignChoose.AssignChoose;
import com.animalShelterManagement.demo.assignChoose.AssignChooseKey;
import com.animalShelterManagement.demo.species.Species;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Breed {

    //@EmbeddedId
    //private BreedKey breedKey;


    @Id
    private String breedName;

    @ManyToOne
    @JoinColumn(name = "speciesName", referencedColumnName = "speciesName")
    private Species species;

}
