package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Paciente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PacienteDAOImpl implements PacienteDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (name, surname, address, dni, registration_date) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, paciente.getName(), paciente.getSurname(), paciente.getAddress(), paciente.getDni(), paciente.getRegistrationDate());
    }

    @Override
    public void updatePaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET name = ?, surname = ?, address = ?, dni = ?, registration_date = ? WHERE id = ?";
        jdbcTemplate.update(sql, paciente.getName(), paciente.getSurname(), paciente.getAddress(), paciente.getDni(), paciente.getRegistrationDate(), paciente.getId());
    }

    @Override
    public void deletePaciente(int id) {
        String sql = "DELETE FROM paciente WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Paciente getPacienteById(int id) {
        String sql = "SELECT * FROM paciente WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Paciente(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("address"),
                        rs.getString("dni"),
                        rs.getDate("registration_date").toLocalDate()
                )
        );
    }

    @Override
    public List<Paciente> getAllPacientes() {
        String sql = "SELECT * FROM paciente";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Paciente(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("address"),
                        rs.getString("dni"),
                        rs.getDate("registration_date").toLocalDate()
                )
        );
    }
}
