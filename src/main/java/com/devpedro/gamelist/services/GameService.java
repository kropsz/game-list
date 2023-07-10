package com.devpedro.gamelist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devpedro.gamelist.dto.GameDTO;
import com.devpedro.gamelist.dto.GameMinDTO;
import com.devpedro.gamelist.entities.Game;
import com.devpedro.gamelist.repositories.GameRepository;



@Service
public class GameService {
     
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //boa pratica para colocar em todo metodo service para respeitar o ASIDI
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
        
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
         return dto;
    }
}