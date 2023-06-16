package com.animalShelterManagement.demo.species;

import jakarta.persistence.*;

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
    private String species_name;
    private int number_limit;

    public Species() {
    }

    public Species(String name, int number_limit) {
        this.species_name = name;
        this.number_limit = number_limit;
    }

    public Species(Long id, String name, int number_limit) {
        this.id = id;
        this.species_name = name;
        this.number_limit = number_limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public int getNumber_limit() {
        return number_limit;
    }

    public void setNumber_limit(int number_limit) {
        this.number_limit = number_limit;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", name='" + species_name + '\'' +
                ", number_limit=" + number_limit +
                '}';
    }
}
