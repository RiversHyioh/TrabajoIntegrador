package com.clinicaodontologica.service;

import com.clinicaodontologica.dao.UsuarioDAO;
import com.clinicaodontologica.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public Usuario getUsuarioByUsername(String username) {
        return usuarioDAO.getUsuarioByUsername(username);
    }
}
