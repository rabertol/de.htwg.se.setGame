package de.htwg.se.setgame.controller.impl.logic.impl;


import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.impl.ModelFactory;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by raina on 03.06.2015.
 */
public class PackProviderTest {


    private PackProvider target;

    @Test
    public void testGetCards() {
        this.target = new PackProvider(new ModelFactory());
        boolean b = false;

        for (ICard cards : target.getPack().getPack()) {
            if (cards.getColor().equals(CardAttribute.attributeNameAndFeature.get("COLORS").get(0))
                    || cards.getColor().equals(CardAttribute.attributeNameAndFeature.get("COLORS").get(1))
                    || cards.getColor().equals(CardAttribute.attributeNameAndFeature.get("COLORS").get(2))
                    && cards.getForm().equals(CardAttribute.attributeNameAndFeature.get("FORM").get(0))
                    || cards.getForm().equals(CardAttribute.attributeNameAndFeature.get("FORM").get(1))
                    || cards.getForm().equals(CardAttribute.attributeNameAndFeature.get("FORM").get(2))
                    && cards.getPanelFilling().equals(CardAttribute.attributeNameAndFeature.get("FILL").get(0))
                    || cards.getPanelFilling().equals(CardAttribute.attributeNameAndFeature.get("FILL").get(1))
                    || cards.getPanelFilling().equals(CardAttribute.attributeNameAndFeature.get("FILL").get(2))
                    && cards.getNumberOfComponents().equals((CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(0)))
                    || cards.getNumberOfComponents().equals((CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(1)))
                    || cards.getNumberOfComponents().equals((CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(2)))) {
                b = true;
            } else {
                b = false;
            }

        }
        Assert.assertTrue(b != false);

    }
}







