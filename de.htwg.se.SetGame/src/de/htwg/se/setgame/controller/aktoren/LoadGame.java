package de.htwg.se.setgame.controller.aktoren;

import de.htwg.se.setgame.controller.IController;
import de.htwg.se.setgame.model.IGame;
import de.htwg.se.setgame.util.persistance.IGameDao;

/**
 * Created by David on 22.01.16.
 */
public class LoadGame {


    private String gameToken;

    public IController getController() {
        return controller;
    }

    public void setController(IController controller) {
        this.controller = controller;
    }

    private IController controller;

    public IGameDao getGameDao() {
        return gameDao;
    }

    public void setGameDao(IGameDao gameDao) {
        this.gameDao = gameDao;
    }

    private IGameDao gameDao;

    public String getGameToken() {
        return gameToken;
    }

    public void setGameToken(String gameToken) {
        this.gameToken = gameToken;
    }
    public  LoadGame(String gameToken, IGameDao gameDao, IController controller){
        setGameToken(gameToken);
        setGameDao(gameDao);
        setController(controller);
    }






}