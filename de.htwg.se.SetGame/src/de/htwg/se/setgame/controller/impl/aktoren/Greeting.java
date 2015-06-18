package de.htwg.se.setgame.controller.impl.aktoren;

import akka.japi.Creator;

import java.io.Serializable;

/**
 * Created by raina on 18.06.2015.
 */
public class Greeting implements Serializable {
    public final String who;
    public Greeting(String who) { this.who = who; }
}