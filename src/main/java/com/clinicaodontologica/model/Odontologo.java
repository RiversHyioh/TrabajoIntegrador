package com.clinicaodontologica.model;

public class Odontologo {
    private int id;
    private String name;
    private String surname;
    private String registration;

    public Odontologo() {}

    public Odontologo(int id, String name, String surname, String registration) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.registration = registration;
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
