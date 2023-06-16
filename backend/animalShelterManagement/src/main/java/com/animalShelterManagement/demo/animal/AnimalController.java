package com.animalShelterManagement.demo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/animal")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService){
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimals(){
        return animalService.getAnimals();
    }

    @PostMapping
    public void registerNewAnimal(@RequestBody Animal animal){
        animalService.addNewAnimal(animal);
    }

    @DeleteMapping(path = "{animalId}")
    public void deleteAnimal(@PathVariable("animalId") Long id){
        animalService.deleteAnimal(id);
    }

    @PutMapping(path = "{animalId}")
    public void updateAnimal(
            @PathVariable("animalId") Long animalId,
            @RequestParam(required = false) String name
    ){
        animalService.updateAnimal(animalId, name);
    }
}
