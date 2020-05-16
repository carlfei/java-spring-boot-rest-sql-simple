package com.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sql.model.Almacen;;

@Repository
public interface AlmacenRepositorio extends JpaRepository<Almacen, Integer> {

}
