package com.devpedro.gamelist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devpedro.gamelist.dto.GameListDTO;
import com.devpedro.gamelist.entities.GameList;
import com.devpedro.gamelist.repositories.GameListRepository;




@Service
public class GameListService {
     
    @Autowired
    private GameListRepository gameListRepository;

    

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
           return result.stream().map(x -> new GameListDTO(x)).toList();
    } 
}