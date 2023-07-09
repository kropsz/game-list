package com.devpedro.gamelist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpedro.gamelist.dto.GameMinDTO;
import com.devpedro.gamelist.entities.Game;
import com.devpedro.gamelist.repositories.GameRepository;

@Service
public class GameService {
     
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
         return dto;
    }
}