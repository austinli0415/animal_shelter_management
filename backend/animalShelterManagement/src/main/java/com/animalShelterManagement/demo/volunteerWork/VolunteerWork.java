package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.user.User;
import com.animalShelterManagement.demo.vaccination.VaccinationKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class VolunteerWork {

    @EmbeddedId
    private VolunteerWorkKey volunteerWorkKey;

    private float workHours;

}
