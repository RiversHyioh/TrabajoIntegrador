package com.clinicaodontologica.service;

import com.clinicaodontologica.model.Paciente;

import java.util.List;

public interface PacienteService {
    void addPaciente(Paciente paciente);
    void updatePaciente(Paciente paciente);
    void deletePaciente(Long id);
    Paciente getPacienteById(Long id);
    List<Paciente> getAllPacientes();
}
