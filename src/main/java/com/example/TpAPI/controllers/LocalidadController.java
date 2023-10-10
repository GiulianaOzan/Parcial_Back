package com.example.TpAPI.controllers;

import com.example.TpAPI.entities.Autor;
import com.example.TpAPI.entities.Localidad;
import com.example.TpAPI.services.AutorServiceImpl;
import com.example.TpAPI.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

}

