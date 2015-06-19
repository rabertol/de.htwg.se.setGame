package de.htwg.se.setgame.controller.impl.aktoren;

import akka.actor.UntypedActor;

/**
 * Created by raina on 19.06.2015.
 */
public class Listener extends UntypedActor {
    public void onReceive(Object message) {
        if (message instanceof Result) {
            Result approximation = (Result) message;
            System.out.println(String.format("\n\tSave game: \t\t%s\n",approximation.getResult()));
            getContext().system().shutdown();
        } else {
            unhandled(message);
        }
    }
}
