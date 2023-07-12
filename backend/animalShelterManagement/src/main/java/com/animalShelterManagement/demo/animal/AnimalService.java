package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.assignChoose.AssignChoose;
import com.animalShelterManagement.demo.assignChoose.AssignChooseService;
import com.animalShelterManagement.demo.species.SpeciesRepository;
import com.animalShelterManagement.demo.species.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;
    private final SpeciesRepository speciesRepository;
    private final SpeciesService speciesService;
    private final AssignChooseService assignChooseService;

    @Autowired
    public AnimalService(AnimalRepository animalRepository, SpeciesRepository speciesRepository, SpeciesService speciesService, AssignChooseService assignChooseService) {
        this.animalRepository = animalRepository;
        this.speciesRepository = speciesRepository;
        this.speciesService = speciesService;
        this.assignChooseService = assignChooseService;
    }

    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    public List<Animal> findAllAnimalsBySpeciesName(String speciesName) {return animalRepository.findAllAnimalsBySpeciesSpeciesName(speciesName); }

    public Animal findAnimalById(Long animalId){
        return animalRepository.findById(animalId)
                .orElseThrow(() -> new IllegalStateException("animal with id " + animalId + " does not exist"));
    }

    public int findAvailableSpacesBySpecies(String speciesName) {
        int totalSpaces =  speciesService.findAvailableSpacesBySpeciesName(speciesName);
        int occupiedSpaces = findAllAnimalsBySpeciesName(speciesName).size();
        return totalSpaces - occupiedSpaces;
    }

    public List<AssignChoose> findAnimalWithBreed(Long animalId){
        return assignChooseService.findAnimalWithBreed(animalId);
    }


    public void addNewAnimal(Animal animal) {
        Optional<Animal> animalOptional = animalRepository.findAnimalByName(animal.getName());
        if(animalOptional.isPresent()){
            throw new IllegalStateException("name exist");
        }
        animalRepository.save(animal);
    }

    public void deleteAnimal(Long animalId) {
        boolean exists = animalRepository.existsById(animalId);
        if(!exists){
            throw new IllegalStateException("animal with id " + animalId + " does not exist");
        }
        animalRepository.deleteById(animalId);
    }

    @Transactional
    public void updateAnimal(Long animalId, String name) {
        Animal animal = animalRepository.findById(animalId)
                .orElseThrow(() -> new IllegalStateException("animal with id " + animalId + " does not exist"));
        if(name != null && name.length() > 0 && !Objects.equals(animal.getName(), name)){
            animal.setName(name);
        }
    }

}
