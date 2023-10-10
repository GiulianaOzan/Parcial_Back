package com.example.TpAPI.services;

import com.example.TpAPI.entities.Persona;
import com.example.TpAPI.repositories.BaseRepository;
import com.example.TpAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
       try{
           //List<Persona> personas = personaRepository.findByNombreContainingOrApellido(filtro, filtro);
          //List<Persona> personas = personaRepository.search(filtro);
           List<Persona> personas = personaRepository.searchNativo(filtro);
           return personas;

       }catch (Exception e){
           throw new Exception(e.getMessage());
       }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellido(filtro, filtro, pageable);
            //Page<Persona> personas = personaRepository.search(filtro, pageable);
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
