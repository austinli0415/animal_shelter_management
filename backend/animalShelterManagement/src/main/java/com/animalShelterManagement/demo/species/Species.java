package com.animalShelterManagement.demo.species;

import com.animalShelterManagement.demo.animal.Animal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Species {

    @Id
    private String name;
    private int numberLimit;

    //@OneToMany
    //private List<Animal> animals;

    /*
    public Species(String name, int numberLimit) {
        this.name = name;
        this.numberLimit = numberLimit;
    }
     */
}
