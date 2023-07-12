package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignChooseService {

    private final AssignChooseRepository assignChooseRepository;

    @Autowired
    public AssignChooseService(AssignChooseRepository assignChooseRepository) {
        this.assignChooseRepository = assignChooseRepository;
    }

    public List<AssignChoose> getAssignChooses() {
        return assignChooseRepository.findAll();
    }

    public List<AssignChoose> findAnimalWithBreed(Long animalId){return assignChooseRepository.findByAssignChooseKeyAnimalAnimalId(animalId);}
}
