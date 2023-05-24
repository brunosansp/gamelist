package com.brunosansp.gamelist.dto;

import com.brunosansp.gamelist.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private Integer gameYear;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {}

    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }

    public Long getId() {
        return id;
    }

    public GameDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GameDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public GameDTO setGameYear(Integer gameYear) {
        this.gameYear = gameYear;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public GameDTO setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getPlatforms() {
        return platforms;
    }

    public GameDTO setPlatforms(String platforms) {
        this.platforms = platforms;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public GameDTO setScore(Double score) {
        this.score = score;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public GameDTO setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public GameDTO setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public GameDTO setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }
}
