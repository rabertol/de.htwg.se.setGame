package de.htwg.se.setgame.controller.impl.aktoren;

import akka.actor.UntypedActor;



/**
 * Created by raina on 19.06.2015.
 */
public class SaveGameWorker extends UntypedActor {



    public void onReceive(Object message) {
        if (message instanceof SaveGame) {
            SaveGame saveGame = (SaveGame) message;
            saveGame.getGameDao().createOrUpdateGame(saveGame.getGame());
            String result = saveGame.getGame().getId();
            getSender().tell(new Result(result), getSelf());
        } else {
            unhandled(message);
        }
    }
}