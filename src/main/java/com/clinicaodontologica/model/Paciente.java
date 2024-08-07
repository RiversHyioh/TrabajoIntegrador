package com.clinicaodontologica.model;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String name;
    private String surname;
    private String address;
    private String dni;
    private LocalDate registrationDate;

    public Paciente() {}

    public Paciente(int id, String name, String surname, String address, String dni, LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.dni = dni;
        this.registrationDate = registrationDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
