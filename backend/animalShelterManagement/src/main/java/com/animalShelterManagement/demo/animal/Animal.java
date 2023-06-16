package com.animalShelterManagement.demo.animal;

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
    private String species_name;

    public Animal() {
    }

    public Animal(Long id, String name, String species_name) {
        this.id = id;
        this.name = name;
        this.species_name = species_name;
    }

    public Animal(String name, String species_name) {
        this.name = name;
        this.species_name = species_name;
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

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species_name='" + species_name + '\'' +
                '}';
    }
}
