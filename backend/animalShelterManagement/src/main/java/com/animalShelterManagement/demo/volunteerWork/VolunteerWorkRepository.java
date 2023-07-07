package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerWorkRepository extends JpaRepository<VolunteerWork, VolunteerWorkKey> {
}
