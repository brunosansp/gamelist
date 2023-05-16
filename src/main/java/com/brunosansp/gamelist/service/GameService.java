package com.brunosansp.gamelist.service;

import com.brunosansp.gamelist.dto.GameDTO;
import com.brunosansp.gamelist.dto.GameMinDTO;
import com.brunosansp.gamelist.entities.Game;
import com.brunosansp.gamelist.projections.GameMinProjection;
import com.brunosansp.gamelist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByListId(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(e -> new GameMinDTO(e)).toList();
    }
}
