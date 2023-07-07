package com.animalShelterManagement.demo.vaccination;

import com.animalShelterManagement.demo.animal.Animal;
import com.animalShelterManagement.demo.vaccinationType.VaccinationType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "petId", referencedColumnName = "id")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "vaccinationTypeName", referencedColumnName = "vaccinationTypeName")
    private VaccinationType vaccinationType;

    private LocalDate dateAdministered;
}
