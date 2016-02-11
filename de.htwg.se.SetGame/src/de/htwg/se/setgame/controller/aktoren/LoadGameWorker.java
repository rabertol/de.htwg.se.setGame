package de.htwg.se.setgame.controller.aktoren;

import akka.actor.UntypedActor;
import de.htwg.se.setgame.model.IGame;

/**
 * Created by David on 22.01.16.
 */
public class LoadGameWorker extends UntypedActor {


    public void onReceive(Object message) {
        if (message instanceof LoadGame) {
            LoadGame loadGame = (LoadGame) message;
            IGame result = loadGame.getGameDao().findGame(loadGame.getGameToken());
            getContext().parent().tell(new Result(result), getSelf());
            try {
                Thread.sleep(1000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            loadGame.getController().setGameForActor(result);

        }  else {
            unhandled(message);
        }
    }
}

