package de.htwg.se.setgame.model.impl;

import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IModelFactory;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {

	ICard target = null;
	@Before
	public void setUp() {
        IModelFactory modelFactory = new ModelFactory();
        this.target = modelFactory.createCard();
        target.setColor("red");
        target.setForm("wave");
        target.setPanelFilling("fill");
        target.setNumberOfComponents(1);

    }
	@Test
	public void testCard() {
		assert(target != null);
		
	}
    @Test
    public void createCartTest_Fail(){
        Card card = new Card();
        card.setColor("bla");
        card.setForm("bla");
        card.setPanelFilling("bla");
        card.setNumberOfComponents(-100);
        Assert.assertTrue(card.getColor() == null && card.getForm() == null && card.getPanelFilling() == null && card.getNumberOfComponents() == -1);

    }
    @Test
    public void createCart_ok(){
        Card card1 = new Card();
        card1.setColor(CardAttribute.COLORS[0]);
        card1.setForm(CardAttribute.FORM[1]);
        card1.setPanelFilling(CardAttribute.FILL[1]);
        card1.setNumberOfComponents(CardAttribute.NUMBEROFCOMPONET[0]);
        Assert.assertTrue(card1.compareTo(target));
    }
    @Test
    public void test_ToString(){
        String result = target.toString();
        Assert.assertTrue(result != null);

    }
    @Test
    public void compareTo_false(){
        Card card1 = new Card();
        card1.setColor(CardAttribute.COLORS[2]);
        card1.setForm(CardAttribute.FORM[1]);
        card1.setPanelFilling(CardAttribute.FILL[1]);
        card1.setNumberOfComponents(CardAttribute.NUMBEROFCOMPONET[0]);
        Assert.assertTrue(card1.compareTo(target) == false);

    }

}
