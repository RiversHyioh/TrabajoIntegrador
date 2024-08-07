package com.clinicaodontologica.service;

import com.clinicaodontologica.dao.PacienteDAO;
import com.clinicaodontologica.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacienteDAO pacienteDAO;

    @Override
    public void addPaciente(Paciente paciente) {
        pacienteDAO.addPaciente(paciente);
    }

    @Override
    public void updatePaciente(Paciente paciente) {
        pacienteDAO.updatePaciente(paciente);
    }

    @Override
    public void deletePaciente(Long id) {
        pacienteDAO.deletePaciente(id);
    }

    @Override
    public Paciente getPacienteById(Long id) {
        return pacienteDAO.getPacienteById(id);
    }

    @Override
    public List<Paciente> getAllPacientes() {
        return pacienteDAO.getAllPacientes();
    }
}
