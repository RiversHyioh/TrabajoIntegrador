package com.clinicaodontologica.controller;

import com.clinicaodontologica.model.Turno;
import com.clinicaodontologica.service.OdontologoService;
import com.clinicaodontologica.service.PacienteService;
import com.clinicaodontologica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TurnoController {
    @Autowired
    private TurnoService turnoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("turnos", turnoService.getAllTurnos());
        return "turno/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("turno", new Turno());
        model.addAttribute("pacientes", pacienteService.getAllPacientes());
        model.addAttribute("odontologos", odontologoService.getAllOdontologos());
        return "turno/add";
    }

    @PostMapping("/add")
    public String addTurno(@ModelAttribute Turno turno) {
        turnoService.addTurno(turno);
        return "redirect:/turnos";
    }

    // Add methods for update, delete, etc.
}
