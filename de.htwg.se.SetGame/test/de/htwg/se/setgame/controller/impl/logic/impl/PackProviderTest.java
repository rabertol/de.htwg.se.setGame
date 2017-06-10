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


    public static final String[] FORME = {"ovally", "wave", "balk"};
    private PackProvider target;

    @Test
    public void testGetCards() {
        this.target = new PackProvider(new ModelFactory());
        boolean b = false;

        for (ICard cards : target.getPack().getPack()) {
            if (cards.getColor().equals(CardAttribute.COLORS[0])
                    || cards.getColor().equals(CardAttribute.COLORS[1])
                    || cards.getColor().equals(CardAttribute.COLORS[2])
                    && cards.getForm().equals(CardAttribute.FORM[0])
                    || cards.getForm().equals(CardAttribute.FORM[1])
                    || cards.getForm().equals(CardAttribute.FORM[2])
                    && cards.getPanelFilling().equals(CardAttribute.FILL[0])
                    || cards.getPanelFilling().equals(CardAttribute.FILL[1])
                    || cards.getPanelFilling().equals(CardAttribute.FILL[2])
                    && cards.getNumberOfComponents() == 1
                    || cards.getNumberOfComponents() == 2
                    || cards.getNumberOfComponents() == 3) {
                b = true;
            } else {
                b = false;
            }

        }
        Assert.assertTrue(b != false);

    }
}







