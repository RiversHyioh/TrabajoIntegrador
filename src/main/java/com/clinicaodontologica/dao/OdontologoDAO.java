package com.clinicaodontologica.dao;

import com.clinicaodontologica.model.Odontologo;
import java.util.List;

public interface OdontologoDAO {
    void addOdontologo(Odontologo odontologo);
    void updateOdontologo(Odontologo odontologo);
    void deleteOdontologo(Long id);
    Odontologo getOdontologoById(Long id);
    List<Odontologo> getAllOdontologos();
}
