package com.animalShelterManagement.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmailAddress(String email);

    @Query(value = "select u.firstName, u.lastName, u.emailAddress, u.phoneNumber from User u where u.role = Role.volunteer")
    List<Object> getVolunteers();

    @Query(value = "select u.firstName, u.lastName, u.emailAddress, u.phoneNumber from User " +
            "u where u.role = Role.volunteer and u.firstName = :firstName or u.lastName = :lastName")
    List<Object> getVolunteerByFirstNameOrLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
