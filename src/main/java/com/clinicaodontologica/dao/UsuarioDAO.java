package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Usuario;
import java.util.List;

public interface UsuarioDAO {
    void addUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(int id);
    Usuario getUsuarioById(int id);
    Usuario getUsuarioByUsername(String username);
    List<Usuario> getAllUsuarios();
}
