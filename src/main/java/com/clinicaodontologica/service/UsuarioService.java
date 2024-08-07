package com.clinicaodontologica.service;

import com.clinicaodontologica.model.Usuario;

public interface UsuarioService {
    Usuario getUsuarioByUsername(String username);
}
