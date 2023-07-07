package com.animalShelterManagement.demo.vaccinationType;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationType {

    @Id
    private String vaccinationTypeName;
}
