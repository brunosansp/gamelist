package com.brunosansp.gamelist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK belongingPK = new BelongingPK();

    private Integer position;

    public Belonging() {}

    public Belonging(Game game, GameList gameList, Integer position) {
        this.belongingPK.setGame(game);
        this.belongingPK.setGameList(gameList);
        this.position = position;
    }
}
