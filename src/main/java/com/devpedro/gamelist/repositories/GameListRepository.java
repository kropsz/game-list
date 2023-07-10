package com.devpedro.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpedro.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}