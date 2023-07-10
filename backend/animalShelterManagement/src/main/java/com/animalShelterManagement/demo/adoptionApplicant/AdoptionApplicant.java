package com.animalShelterManagement.demo.adoptionApplicant;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionApplicant {

    @Id
    private String emailAddress;
    private String applicantFirstName;
    private String applicantLastName;
    private String zipCode;
    private String city;
    private String street;
    private String state;
    private String phoneNumber;

}
