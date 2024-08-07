package com.clinicaodontologica.model;

import java.time.LocalDate;

public class Turno {
    private int id;
    private int patientId;
    private int dentistId;
    private LocalDate date;
    private String time;

    public Turno() {}

    public Turno(int id, int patientId, int dentistId, LocalDate date, String time) {
        this.id = id;
        this.patientId = patientId;
        this.dentistId = dentistId;
        this.date = date;
        this.time = time;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDentistId() {
        return dentistId;
    }

    public void setDentistId(int dentistId) {
        this.dentistId = dentistId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
