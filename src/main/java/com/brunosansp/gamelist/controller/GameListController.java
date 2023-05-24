package com.brunosansp.gamelist.controller;

import com.brunosansp.gamelist.dto.GameListDTO;
import com.brunosansp.gamelist.dto.GameMinDTO;
import com.brunosansp.gamelist.dto.ReplacementDTO;
import com.brunosansp.gamelist.service.GameListService;
import com.brunosansp.gamelist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
