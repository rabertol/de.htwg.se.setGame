package de.htwg.se.setgame.model;

/**
 * Created by raina on 03.06.2015.
 */



public interface IPlayer {
    /**
     *
     * @param pid
     */
	void setPid(int pid);

    /**
     *
     * @param counter
     */
	void setCounter(int counter);

    /**
     *
     * @return which id has player in game
     */
	int getPid();

    /**
     *
     * @return counter of set
     */
	int getCounter();
	
}
