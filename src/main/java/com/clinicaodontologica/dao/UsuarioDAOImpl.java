package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (username, password, role) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, usuario.getUsername(), usuario.getPassword(), usuario.getRole());
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET password = ?, role = ? WHERE id = ?";
        jdbcTemplate.update(sql, usuario.getPassword(), usuario.getRole(), usuario.getId());
    }

    @Override
    public void deleteUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Usuario getUsuarioById(int id) {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Usuario(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                )
        );
    }

    @Override
    public Usuario getUsuarioByUsername(String username) {
        String sql = "SELECT * FROM usuario WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, (rs, rowNum) ->
                new Usuario(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                )
        );
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        String sql = "SELECT * FROM usuario";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Usuario(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                )
        );
    }
}
