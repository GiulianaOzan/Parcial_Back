package com.example.TpAPI.services;

import com.example.TpAPI.entities.Localidad;
import com.example.TpAPI.entities.Persona;
import com.example.TpAPI.repositories.BaseRepository;
import com.example.TpAPI.repositories.LocalidadRepository;
import com.example.TpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {


    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
