package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Turno;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TurnoDAOImpl implements TurnoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTurno(Turno turno) {
        String sql = "INSERT INTO turno (patient_id, dentist_id, date, time) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, turno.getPatientId(), turno.getDentistId(), turno.getDate(), turno.getTime());
    }

    @Override
    public void updateTurno(Turno turno) {
        String sql = "UPDATE turno SET patient_id = ?, dentist_id = ?, date = ?, time = ? WHERE id = ?";
        jdbcTemplate.update(sql, turno.getPatientId(), turno.getDentistId(), turno.getDate(), turno.getTime(), turno.getId());
    }

    @Override
    public void deleteTurno(int id) {
        String sql = "DELETE FROM turno WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Turno getTurnoById(int id) {
        String sql = "SELECT * FROM turno WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Turno(
                        rs.getInt("id"),
                        rs.getInt("patient_id"),
                        rs.getInt("dentist_id"),
                        rs.getDate("date").toLocalDate(),
                        rs.getString("time")
                )
        );
    }

    @Override
    public List<Turno> getAllTurnos() {
        String sql = "SELECT * FROM turno";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Turno(
                        rs.getInt("id"),
                        rs.getInt("patient_id"),
                        rs.getInt("dentist_id"),
                        rs.getDate("date").toLocalDate(),
                        rs.getString("time")
                )
        );
    }
}
