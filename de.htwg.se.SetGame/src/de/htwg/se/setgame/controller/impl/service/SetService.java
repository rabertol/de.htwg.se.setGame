package de.htwg.se.setgame.controller.impl.service;

import de.htwg.se.setgame.model.ICard;

/**
 * Created by raina on 17.06.2015.
 */
public class SetService {

    public SetService() {

    }

    /**
     * @param stringOne   color
     * @param stringTwo   form
     * @param stringThree filling
     * @return
     */
    public boolean proveString(String stringOne, String stringTwo,
                               String stringThree) {
        if (stringOne.compareTo(stringTwo) == 0
                && stringOne.compareTo(stringThree) == 0
                && stringTwo.compareTo(stringThree) == 0) {
            return true;
        } else if (stringOne.compareTo(stringTwo) != 0
                && stringOne.compareTo(stringThree) != 0
                && stringTwo.compareTo(stringThree) != 0) {
            return true;
        }
        return false;
    }
    
    public boolean isASet(ICard cardOne, ICard cardTwo, ICard cardThree) {
		if (proveString(cardOne.getForm(), cardTwo.getForm(), cardThree.getForm() ) && proveString(cardOne.getColor(), cardTwo.getColor(), cardThree.getColor() ) && proveString(cardOne.getNumberOfComponents(), cardTwo.getNumberOfComponents(), cardThree.getNumberOfComponents() ) && proveString(cardOne.getTexture(), cardTwo.getTexture(), cardThree.getTexture() ) ) {
			return true;
		}
        return false;
    }
}

