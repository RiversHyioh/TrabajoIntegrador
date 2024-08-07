package com.clinicaodontologica.service;

import com.clinicaodontologica.dao.OdontologoDAO;
import com.clinicaodontologica.model.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    @Autowired
    private OdontologoDAO odontologoDAO;

    @Override
    public void addOdontologo(Odontologo odontologo) {
        odontologoDAO.addOdontologo(odontologo);
    }

    @Override
    public void updateOdontologo(Odontologo odontologo) {
        odontologoDAO.updateOdontologo(odontologo);
    }

    @Override
    public void deleteOdontologo(Long id) {
        odontologoDAO.deleteOdontologo(id);
    }

    @Override
    public Odontologo getOdontologoById(Long id) {
        return odontologoDAO.getOdontologoById(id);
    }

    @Override
    public List<Odontologo> getAllOdontologos() {
        return odontologoDAO.getAllOdontologos();
    }
}
