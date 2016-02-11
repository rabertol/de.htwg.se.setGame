package de.htwg.se.setgame.controller.aktoren;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Created by David on 22.01.16.
 */
public class SystemOfAkka {
    private static ActorSystem system =  null;
    private static ActorRef master = null;
    private SystemOfAkka(){

    }

    public static ActorSystem getSystem(){
        if(system== null){
            system = ActorSystem.create("SetGameSystem");
        }
        return system;
    }

    public static ActorRef getMaster(){
        if(master == null){
            master = SystemOfAkka.getSystem().actorOf(Props.create(LoadGameMaster.class), "master");

        }
        return master;

    }
}
