package com.animalShelterManagement.demo.animal;

import com.animalShelterManagement.demo.species.Species;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "/animalsBySpecies")
    public List<Animal> findAllAnimalsBySpeciesName(@PathParam(value = "speciesName") String speciesName){
        return animalService.findAllAnimalsBySpeciesName(speciesName);
    }

    @GetMapping(path = "/availableSpacesBySpecies")
    public int findAvailableSpacesBySpecies(@PathParam(value = "speciesName") String speciesName){
        return animalService.findAvailableSpacesBySpecies(speciesName);
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
