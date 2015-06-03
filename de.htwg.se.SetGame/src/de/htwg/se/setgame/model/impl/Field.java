package de.htwg.se.setgame.model.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import de.htwg.se.setgame.model.AField;
import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IPack;

/**
 * Class Field.
 * 
 * @author David Simon & Raina Bertolini
 * @date 7.12.201NUMBERFORONELINE
 * @category Modell
 */
public class Field extends AField {
    private List<ICard> cardsInField;
    public Field(){
        this.cardsInField = new LinkedList<ICard>();
    }

    @Override
    public void setCardInField(List<ICard> cardsInField) {

    }

    @Override
    public List<ICard> getCardsInField() {
        return null;
    }
}
