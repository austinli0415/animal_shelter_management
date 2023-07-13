package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.adopt.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VolunteerWorkService {

    private final VolunteerWorkRepository volunteerWorkRepository;

    @Autowired
    public VolunteerWorkService(VolunteerWorkRepository volunteerWorkRepository) {
        this.volunteerWorkRepository = volunteerWorkRepository;
    }

    public List<VolunteerWork> getVolunteerWorks() {
        return volunteerWorkRepository.findAll();
    }

    public List<VolunteerWork> findByYearMonth(int year, int month){
        return volunteerWorkRepository.findByYearMonth(year, month);
    }
}
