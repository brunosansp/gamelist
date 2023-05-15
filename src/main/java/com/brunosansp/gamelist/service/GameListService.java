package com.brunosansp.gamelist.service;

import com.brunosansp.gamelist.dto.GameListDTO;
import com.brunosansp.gamelist.entities.GameList;
import com.brunosansp.gamelist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
