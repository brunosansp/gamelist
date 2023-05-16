package com.brunosansp.gamelist.dto;

import com.brunosansp.gamelist.entities.Game;
import com.brunosansp.gamelist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {}

    public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.year = entity.getYear();
        this.title = entity.getTitle();
    }

    public GameMinDTO(GameMinProjection gameMinProjection) {
        this.id = gameMinProjection.getId();
        this.imgUrl = gameMinProjection.getImgUrl();
        this.title = gameMinProjection.getTitle();
        this.year = gameMinProjection.getYear();
        this.shortDescription = gameMinProjection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
