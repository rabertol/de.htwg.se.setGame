package de.htwg.se.setgame.controller.impl.aktoren;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.routing.RoundRobinPool;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;


/**
 * Created by raina on 19.06.2015.
 */
public class SaveGameMaster extends UntypedActor {


    private final long start = System.currentTimeMillis();

    private final ActorRef listener;
    private final ActorRef workerRouter;

    public SaveGameMaster(ActorRef listener) {

        this.listener = listener;

        workerRouter = SystemOfAkka.getSystem().actorOf(Props.create(SaveGameWorker.class).withRouter(new RoundRobinPool(1)), "gamesaver");
    }

    public void onReceive(Object message) {
        if (message instanceof SaveGame) {

            workerRouter.tell(message, getSelf());

        } else if (message instanceof Result) {
            Result result = (Result) message;

            // Send the result to the listener
            Duration duration = Duration.create(System.currentTimeMillis() - start, TimeUnit.MILLISECONDS);
            listener.tell(result.getResult(), getSelf());
            // Stops this actor and all its supervised children
            getContext().stop(getSelf());

        } else {
            unhandled(message);
        }
    }
}

