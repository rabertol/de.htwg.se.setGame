package de.htwg.se.setgame.controller.impl.aktoren;


import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

/**
 * Created by raina on 18.06.2015.
 */

public class GreetingActor extends UntypedActor {

    static public class Greeting {
        private final String from;

        public Greeting(String from) {
            this.from = from;
        }

        public String getGreeter() {
            return from;
        }
    }

    public void onReceive(Object message) throws Exception {
        if (message instanceof Greeting) {
            getSender().tell("Hello " + ((Greeting) message).getGreeter(), getSelf());
        } else
            unhandled(message);
    }
}