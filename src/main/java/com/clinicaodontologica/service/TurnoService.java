package com.clinicaodontologica.service;

import com.clinicaodontologica.model.Turno;

import java.util.List;

public interface TurnoService {
    void addTurno(Turno turno);
    void updateTurno(Turno turno);
    void deleteTurno(Long id);
    Turno getTurnoById(Long id);
    List<Turno> getAllTurnos();
}
