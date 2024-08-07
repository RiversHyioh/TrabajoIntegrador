package com.clinicaodontologica.controller;

import com.clinicaodontologica.model.Odontologo;
import com.clinicaodontologica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("odontologos", odontologoService.getAllOdontologos());
        return "odontologo/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("odontologo", new Odontologo());
        return "odontologo/add";
    }

    @PostMapping("/add")
    public String addOdontologo(@ModelAttribute Odontologo odontologo) {
        odontologoService.addOdontologo(odontologo);
        return "redirect:/odontologos";
    }

    // Add methods for update, delete, etc.
}
