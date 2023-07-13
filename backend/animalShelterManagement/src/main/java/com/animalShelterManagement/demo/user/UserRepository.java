package com.animalShelterManagement.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmailAddress(String email);

    @Query(value = "select u.firstName, u.lastName, u.emailAddress, u.phoneNumber from User u where u.role = Role.volunteer")
    List<Object> getVolunteers();
}
