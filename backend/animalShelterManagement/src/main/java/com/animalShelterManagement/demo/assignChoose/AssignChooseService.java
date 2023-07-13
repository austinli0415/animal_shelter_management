package com.animalShelterManagement.demo.assignChoose;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<AssignChoose> findAnimalWithBreed(Long animalId){
        return assignChooseRepository.findByAssignChooseKeyAnimalAnimalId(animalId);
    }

    public AnimalBreed findByAnimalIdGrouped(Long animalId){
        List<AssignChoose> assignChoose = assignChooseRepository.findByAssignChooseKeyAnimalAnimalId(animalId);
        if(assignChoose.size() == 0) return null;
        List<String> breeds = new ArrayList<>();
        for(AssignChoose item : assignChoose){
            breeds.add(item.getAssignChooseKey().getBreed().getBreedName());
        }
        return new AnimalBreed(assignChoose.get(0).getAssignChooseKey().getAnimal(), breeds);
    }
}
