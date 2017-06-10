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
        target.setNumberOfComponents("1");

    }
	@Test
	public void testCard() {
		assert(target != null);
		
	}

    @Test
    public void createCart_ok(){
        Card card1 = new Card();
        card1.setColor(CardAttribute.attributeNameAndFeature.get("COLORS").get(0));
        card1.setForm(CardAttribute.attributeNameAndFeature.get("FORM").get(1));
        card1.setPanelFilling(CardAttribute.attributeNameAndFeature.get("FILL").get(1));
        card1.setNumberOfComponents(CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(0));
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
        card1.setColor(CardAttribute.attributeNameAndFeature.get("COLORS").get(2));
        card1.setForm(CardAttribute.attributeNameAndFeature.get("FORM").get(1));
        card1.setPanelFilling(CardAttribute.attributeNameAndFeature.get("FILL").get(1));
        card1.setNumberOfComponents(CardAttribute.attributeNameAndFeature.get("NUMBEROFCOMPONET").get(0));
        Assert.assertTrue(card1.compareTo(target) == false);

    }

}
