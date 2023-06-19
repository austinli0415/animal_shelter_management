package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import jakarta.persistence.*;


@Entity
@Table
public class Animal {

    @Id
    @SequenceGenerator(
            name="animal_sequence",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_sequence"
    )

    private Long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "speciesName", referencedColumnName = "name")
    private Species species;

    public Animal() {
    }

    public Animal(String name ) {
        this.name = name;
    }

    public Animal(Long id, String name ) {
        this.id = id;
        this.name = name;
    }

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species=" + species +
                '}';
    }
}
