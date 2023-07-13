package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface AssignChooseRepository extends JpaRepository<AssignChoose, AssignChooseKey> {
    List<AssignChoose> findByAssignChooseKeyAnimalAnimalId(Long animalId);

}
