package de.htwg.se.setgame.controller.aktoren;

import de.htwg.se.setgame.model.IGame;
import de.htwg.se.setgame.util.persistance.IGameDao;

/**
 * Created by David on 22.01.16.
 */
public class Result {
    public IGame getResult() {
        return result;
    }

    public void setResult(IGame result) {
        this.result = result;
    }

    private IGame result;
    public Result(IGame result) {
        this.result = result;
    }
}