package com.animalShelterManagement.demo.requireOrNot;

import com.animalShelterManagement.demo.species.Species;
import com.animalShelterManagement.demo.vaccinationType.VaccinationType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class RequireOrNotKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "speciesName", referencedColumnName = "name")
    private Species species;

    // @ManyToMany
    @ManyToOne
    @JoinColumn(name = "vaccinationTypeName", referencedColumnName = "vaccinationTypeName")
    private VaccinationType vaccinationType;


}
