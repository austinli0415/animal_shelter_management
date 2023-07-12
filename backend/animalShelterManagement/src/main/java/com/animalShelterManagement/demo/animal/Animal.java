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
    @GeneratedValue
    private Long animalId;
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
        this.animalId = id;
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
