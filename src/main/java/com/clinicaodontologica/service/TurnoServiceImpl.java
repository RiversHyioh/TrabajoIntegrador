package com.clinicaodontologica.service;

import com.clinicaodontologica.dao.TurnoDAO;
import com.clinicaodontologica.model.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {
    @Autowired
    private TurnoDAO turnoDAO;

    @Override
    public void addTurno(Turno turno) {
        turnoDAO.addTurno(turno);
    }

    @Override
    public void updateTurno(Turno turno) {
        turnoDAO.updateTurno(turno);
    }

    @Override
    public void deleteTurno(Long id) {
        turnoDAO.deleteTurno(id);
    }

    @Override
    public Turno getTurnoById(Long id) {
        return turnoDAO.getTurnoById(id);
    }

    @Override
    public List<Turno> getAllTurnos() {
        return turnoDAO.getAllTurnos();
    }
}
