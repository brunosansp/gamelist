package com.brunosansp.gamelist.controller;

import com.brunosansp.gamelist.dto.GameMinDTO;
import com.brunosansp.gamelist.entities.Game;
import com.brunosansp.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<Game> result = gameService.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
