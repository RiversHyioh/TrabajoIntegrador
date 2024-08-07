package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Turno;
import java.util.List;

public interface TurnoDAO {
    void addTurno(Turno turno);
    void updateTurno(Turno turno);
    void deleteTurno(int id);
    Turno getTurnoById(int id);
    List<Turno> getAllTurnos();
}
