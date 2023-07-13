package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.animal.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalBreed {

    private Animal animal;
    private List<String> breeds;

}
