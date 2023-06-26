package com.animalShelterManagement.demo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    public List<Animal> getAnimalsBySpeciesId(Long id) {return animalRepository.findAllAnimalsBySpeciesId(id); }

    public List<Animal> findAllAnimalsBySpeciesName(String speciesName) {return animalRepository.findAllAnimalsBySpeciesName(speciesName); }

    public List<Animal> findAllAnimalsByName() { return animalRepository.findAllAnimalsByName(); }

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
