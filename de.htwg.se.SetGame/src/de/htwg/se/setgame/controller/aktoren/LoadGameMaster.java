package de.htwg.se.setgame.controller.aktoren;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.routing.RoundRobinPool;
import scala.concurrent.duration.Duration;
import java.util.concurrent.TimeUnit;




/**
 * Created by David on 22.01.16.
 */
public class LoadGameMaster extends UntypedActor {


    private final long start = System.currentTimeMillis();


    private final ActorRef workerRouter;

    public LoadGameMaster() {



        workerRouter = getContext().actorOf(Props.create(LoadGameWorker.class).withRouter(new RoundRobinPool(1)), "gamesaver");
    }

    public void onReceive(Object message) {
        if (message instanceof LoadGame) {

            workerRouter.tell(message, getSelf());

        } else {
            unhandled(message);
        }
    }
}