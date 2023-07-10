package com.animalShelterManagement.demo.assignChoose;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignChoose {

    @EmbeddedId
    private AssignChooseKey assignChooseKey;
}
