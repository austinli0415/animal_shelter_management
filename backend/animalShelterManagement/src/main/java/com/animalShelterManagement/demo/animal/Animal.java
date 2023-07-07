package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import com.animalShelterManagement.demo.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    private String sex;
    private String alterationStatus;
    private int ageMonths;
    private String description;
    private String microchipId;
    private String surrenderReason;
    private LocalDate surrenderDate;
    private String surrenderByAnimalControl;

    @OneToOne
    @JoinColumn(name = "userEnteredSurrenderInfo", referencedColumnName = "email")
    private User userEnteredSurrenderInfo;

    @ManyToOne
    @JoinColumn(name = "speciesName", referencedColumnName = "name")
    private Species species;

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

}
