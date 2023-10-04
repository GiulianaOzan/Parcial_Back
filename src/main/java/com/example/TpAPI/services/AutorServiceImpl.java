package com.example.TpAPI.services;

import com.example.TpAPI.entities.Autor;
import com.example.TpAPI.repositories.AutorRepository;
import com.example.TpAPI.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {

        super(baseRepository);
        this.autorRepository = autorRepository;

    }
}
