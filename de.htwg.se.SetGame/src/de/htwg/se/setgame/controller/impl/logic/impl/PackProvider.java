package de.htwg.se.setgame.controller.impl.logic.impl;


import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IModelFactory;
import de.htwg.se.setgame.model.IPack;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;

import java.util.*;

/**
 * Created by raina on 03.06.2015.
 */
public class PackProvider {


    /*Instance variable*/
    private IModelFactory modelFactory;
    private IPack pack;
    private List<ICard> results = new LinkedList<>();
    private int count = 0;
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

       int numberOfAttribute = CardAttribute.attributeNameAndFeature.values().size();
        List listC = new ArrayList(CardAttribute.attributeNameAndFeature.values());
        List listK = new ArrayList(CardAttribute.attributeNameAndFeature.keySet());

        rekursiveFunction(listK,listC,new HashMap<>(), numberOfAttribute-1);
        for(int i = 0 ; i < list.length; i++){
            list[i] = results.get(i);
        }

        return list;

    }
    private void rekursiveFunction(List<String> attributeName, List<List<String>> eingeschaften, Map<String,String> attribute, int level){
        if(level == -1){
            ICard card = modelFactory.createCard();
            card.setColor(attribute.get("COLORS"));
            card.setForm(attribute.get("FORM"));
            card.setNumberOfComponents(attribute.get("NUMBEROFCOMPONET"));
            card.setPanelFilling(attribute.get("FILL"));
            results.add(card);
        }else {
            for (String s : eingeschaften.get(level)) {
                attribute.put(attributeName.get(level), s );
                rekursiveFunction(attributeName,eingeschaften ,attribute, level - 1);
            }
        }

    }



    public IPack getPack() {
        return this.pack;
    }
    /**
     * @return pack of cards
     */

}







