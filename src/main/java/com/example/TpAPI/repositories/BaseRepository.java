package com.example.TpAPI.repositories;

import com.example.TpAPI.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.awt.print.Pageable;
import java.io.Serializable;

@NoRepositoryBean

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}
