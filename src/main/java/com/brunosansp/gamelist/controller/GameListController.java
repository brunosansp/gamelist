package com.brunosansp.gamelist.controller;

import com.brunosansp.gamelist.dto.GameListDTO;
import com.brunosansp.gamelist.dto.GameMinDTO;
import com.brunosansp.gamelist.service.GameListService;
import com.brunosansp.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByListId(@PathVariable Long listId) {
        return gameService.findByListId(listId);
    }
}
