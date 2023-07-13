package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface VolunteerWorkRepository extends JpaRepository<VolunteerWork, VolunteerWorkKey> {

    @Query(value = "select v from VolunteerWork " +
            "v where year(v.volunteerWorkKey.workDate) = ?1 and month(v.volunteerWorkKey.workDate) = ?2")
    List<VolunteerWork> findByYearMonth(@Param("year") int year, @Param("month") int month);
}
