package com.animalShelterManagement.demo.requireOrNot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class RequireOrNot {

    @EmbeddedId
    private RequireOrNotKey requireOrNotKey;

    private String requiredForAdoption;
}
