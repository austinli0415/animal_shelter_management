package com.animalShelterManagement.demo.species;

import com.animalShelterManagement.demo.animal.Animal;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Species {
    @Id
    @SequenceGenerator(
            name = "species_sequence",
            sequenceName = "species_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "species_sequence"
    )
    private Long id;
    private String name;
    private int numberLimit;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Animal> animals;

    public Species() {
    }
    public Species(String speciesName) {
        this.name = speciesName;
    }

    public Species(String name, int number_limit) {
        this.name = name;
        this.numberLimit = number_limit;
    }

    public Species(Long id, String name, int number_limit) {
        this.id = id;
        this.name = name;
        this.numberLimit = number_limit;
    }

    public Species(String species_name, int number_limit, List<Animal> animals) {
        this.name = species_name;
        this.numberLimit = number_limit;
        this.animals = animals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(int numberLimit) {
        this.numberLimit = numberLimit;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number_limit=" + numberLimit +
                '}';
    }
}
