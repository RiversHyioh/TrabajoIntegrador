package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Paciente;
import java.util.List;

public interface PacienteDAO {
    void addPaciente(Paciente paciente);
    void updatePaciente(Paciente paciente);
    void deletePaciente(int id);
    Paciente getPacienteById(int id);
    List<Paciente> getAllPacientes();
}
