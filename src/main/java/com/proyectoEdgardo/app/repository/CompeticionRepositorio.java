package com.proyectoEdgardo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoEdgardo.app.tables.Competicion;

public interface CompeticionRepositorio extends JpaRepository<Competicion, Integer> {

}
