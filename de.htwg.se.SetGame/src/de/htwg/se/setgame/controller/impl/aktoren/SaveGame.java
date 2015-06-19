package de.htwg.se.setgame.controller.impl.aktoren;

import de.htwg.se.setgame.model.IGame;
import de.htwg.se.setgame.util.persistence.IGameDao;

/**
 * Created by raina on 19.06.2015.
 */
public class SaveGame {

    private IGameDao gameDao;

    public IGame getGame() {
        return game;
    }

    public void setGame(IGame game) {
        this.game = game;
    }

    public IGameDao getGameDao() {
        return gameDao;
    }

    public void setGameDao(IGameDao gameDao) {
        this.gameDao = gameDao;
    }

    private IGame game;
    public SaveGame(IGameDao gameDao, IGame game){
        this.game = game;
        this.gameDao = gameDao;
    }


}
