package com.clinicaodontologica.controller;

import com.clinicaodontologica.model.Usuario;
import com.clinicaodontologica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {
        Usuario usuario = usuarioService.getUsuarioByUsername(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            session.setAttribute("user", usuario);
            return "redirect:/";
        }
        return "login";
    }
}
