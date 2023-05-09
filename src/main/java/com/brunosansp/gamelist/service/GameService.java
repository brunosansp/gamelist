package com.brunosansp.gamelist.service;

import com.brunosansp.gamelist.dto.GameMinDTO;
import com.brunosansp.gamelist.entities.Game;
import com.brunosansp.gamelist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
