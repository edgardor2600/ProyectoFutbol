package com.proyectoEdgardo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoEdgardo.app.tables.Club;


public interface ClubRepositorio extends JpaRepository<Club, Integer>{
	
}