package com.animalShelterManagement.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Object> getVolunteers(){
        return userRepository.getVolunteers();
    }

    public List<Object> getVolunteerByFirstNameOrLastName(String firstName, String lastName) {
        return userRepository.getVolunteerByFirstNameOrLastName(firstName, lastName);
    }

}
