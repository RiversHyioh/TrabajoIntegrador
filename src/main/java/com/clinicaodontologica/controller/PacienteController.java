package com.clinicaodontologica.controller;

import com.clinicaodontologica.model.Paciente;
import com.clinicaodontologica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("pacientes", pacienteService.getAllPacientes());
        return "paciente/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "paciente/add";
    }

    @PostMapping("/add")
    public String addPaciente(@ModelAttribute Paciente paciente) {
        pacienteService.addPaciente(paciente);
        return "redirect:/pacientes";
    }

    // Add methods for update, delete, etc.
}
