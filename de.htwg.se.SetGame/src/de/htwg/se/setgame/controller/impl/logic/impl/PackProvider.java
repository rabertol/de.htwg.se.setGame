package de.htwg.se.setgame.controller.impl.logic.impl;


import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IModelFactory;
import de.htwg.se.setgame.model.IPack;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by raina on 03.06.2015.
 */
public class PackProvider {




    /*Instance variable*/
    private IModelFactory modelFactory;
    private IPack pack;
    private int colorIndex = 0;
    private int formeIndex = 0;
    private int fillgingIndex = 0;
    private int numbersIdex = 0;

    /**
     * Construct for card
     */

    public PackProvider(IModelFactory modelFactory) {
        this.modelFactory = modelFactory;

        this.pack = modelFactory.createPack();
        List<ICard> cards = new LinkedList<ICard>();
        cards = Arrays.asList(creatCards());
        if (cards != null) {
            this.pack.setPack(cards);
        }
    }

    /**
     * @return the finish pack of the Game
     */
    private ICard[] creatCards() {
        ICard list[] = new ICard[CardAttribute.FIELDSIZE];

        //TODO: Change Pack Provider!!!


        for (int i = 0; i < CardAttribute.FIELDSIZE; i++) {
            list[i] = modelFactory.createCard();
            list[i].setColor(CardAttribute.attributeNameAndFeature.get("COLORS").get(colorIndex));
            list[i].setForm(CardAttribute.attributeNameAndFeature.get("FORM").get(formeIndex));
            System.out.println(CardAttribute.attributeNameAndFeature.get("FILL").get(fillgingIndex));
            list[i].setPanelFilling(CardAttribute.attributeNameAndFeature.get("FILL").get(fillgingIndex));
            list[i].setPanelFilling(CardAttribute.attributeNameAndFeature.get("FILL").get(fillgingIndex));

            list[i].setNumberOfComponents(CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(numbersIdex));
            setFormedIndex();

        }

        return list;

    }

    /**
     * set number of index form
     */
    private void setFormedIndex() {
        int t = this.formeIndex + 1;
        if (t == (CardAttribute.attributeNameAndFeature.size()-1)) {
            setFillIndex();
            this.formeIndex = 0;
        } else {
            this.formeIndex = t;
        }

    }

    /**
     * set index of the fill
     */
    private void setFillIndex() {
        int t = this.fillgingIndex + 1;
        if (t == (CardAttribute.attributeNameAndFeature.size()-1)) {
            this.fillgingIndex = 0;
            setComponentsOfIndex();
        } else {
            this.fillgingIndex = t;
        }

    }

    /**
     * set index of number of Components
     */
    private void setComponentsOfIndex() {
        int t = this.numbersIdex + 1;
        if (t == (CardAttribute.attributeNameAndFeature.size()-1)) {
            this.numbersIdex = 0;
            setColorIndex();
        } else {
            this.numbersIdex = t;
        }
    }

    /**
     * Set Color Index
     */
    private void setColorIndex() {
        int t = this.colorIndex + 1;
        if (t == (CardAttribute.attributeNameAndFeature.size()-1)) {
            this.colorIndex = 0;
        }
        this.colorIndex = t;

    }

    public IPack getPack() {
        return this.pack;
    }
    /**
     * @return pack of cards
     */

}







