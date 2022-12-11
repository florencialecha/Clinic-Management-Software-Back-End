package com.dh.SessionBookingSystem.dto;

import com.dh.SessionBookingSystem.entity.Dentist;
import com.dh.SessionBookingSystem.entity.Patient;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter

public class TurnoDTO {

    private Long id;
    private Patient patient;
    private Dentist dentist;
    private LocalDateTime fechaTurno;

}
