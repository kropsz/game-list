package com.devpedro.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpedro.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}