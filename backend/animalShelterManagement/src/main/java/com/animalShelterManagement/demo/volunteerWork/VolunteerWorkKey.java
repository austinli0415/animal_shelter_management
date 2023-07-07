package com.animalShelterManagement.demo.volunteerWork;

import com.animalShelterManagement.demo.user.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.web.SecurityFilterChain;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class VolunteerWorkKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "userName")
    private User user;

    private LocalDate workDate;

}
