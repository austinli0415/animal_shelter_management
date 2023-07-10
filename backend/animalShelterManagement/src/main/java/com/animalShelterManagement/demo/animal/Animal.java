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
    @JoinColumn(name = "userEnteredSurrenderInfo", referencedColumnName = "userName")
    private User userEnteredSurrenderInfo;

    @ManyToOne
    @JoinColumn(name = "speciesName", referencedColumnName = "speciesName")
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

    public Animal(String name, String sex, String alterationStatus, int ageMonths, String description, String microchipId, String surrenderReason, LocalDate surrenderDate, String surrenderByAnimalControl, User userEnteredSurrenderInfo, Species species) {
        this.name = name;
        this.sex = sex;
        this.alterationStatus = alterationStatus;
        this.ageMonths = ageMonths;
        this.description = description;
        this.microchipId = microchipId;
        this.surrenderReason = surrenderReason;
        this.surrenderDate = surrenderDate;
        this.surrenderByAnimalControl = surrenderByAnimalControl;
        this.userEnteredSurrenderInfo = userEnteredSurrenderInfo;
        this.species = species;
    }
}
