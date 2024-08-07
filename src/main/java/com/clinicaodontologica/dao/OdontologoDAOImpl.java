package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OdontologoDAOImpl implements OdontologoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addOdontologo(Odontologo odontologo) {
        String sql = "INSERT INTO odontologo (name, surname, registration) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, odontologo.getName(), odontologo.getSurname(), odontologo.getRegistration());
    }

    @Override
    public void updateOdontologo(Odontologo odontologo) {
        String sql = "UPDATE odontologo SET name = ?, surname = ?, registration = ? WHERE id = ?";
        jdbcTemplate.update(sql, odontologo.getName(), odontologo.getSurname(), odontologo.getRegistration(), odontologo.getId());
    }

    @Override
    public void deleteOdontologo(Long id) {
        String sql = "DELETE FROM odontologo WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Odontologo getOdontologoById(Long id) {
        String sql = "SELECT * FROM odontologo WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Odontologo(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("registration")
                )
        );
    }

    @Override
    public List<Odontologo> getAllOdontologos() {
        String sql = "SELECT * FROM odontologo";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Odontologo(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("registration")
                )
        );
    }
}
