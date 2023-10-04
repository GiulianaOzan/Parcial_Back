package com.example.TpAPI.repositories;

import com.example.TpAPI.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
