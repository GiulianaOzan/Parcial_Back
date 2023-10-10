package com.example.TpAPI.repositories;

import com.example.TpAPI.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Anotacion metodo Query
    List<Persona> findByNombreAndApellido(String nombre, String apellido);

    Page<Persona> findByNombreAndApellido(String nombre, String apellido, Pageable pageable);

    // boolean existsByDni( int dni);

    //anotacion jpql parmetros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro% ")
    List<Persona> search(String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro% ")
    Page<Persona> search(String filtro,Pageable pageable);

    //anotacion jpql parmetros nombrados

   // @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    //List<Persona> serach(@Param("filtro") String filtro);

    //Query nativo

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            nativeQuery = true
    )
    List<Persona> searchNativo(String filtro);


    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(String filtro, Pageable pageable );

}