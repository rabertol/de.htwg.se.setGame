package de.htwg.se.setgame.controller.impl.aktoren;


import akka.actor.ActorSystem;

/**
 * Created by raina on 19.06.2015.
 */
public class SystemOfAkka {
    private static ActorSystem system =  null;
    private SystemOfAkka(){

    }

    public static ActorSystem getSystem(){
            if(system== null){
                system = ActorSystem.create("SetGameSystem");
            }
        return system;
    }
}
