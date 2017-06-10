package de.htwg.se.setgame.model.impl.atributte;

import javassist.Modifier;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by raina on 17.06.2015.
 */
public class CardAtributteTest {
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = CardAttribute.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    @Test
    public void getDaoManagerSession_ok(){
        String[] FORME = (String[])CardAttribute.attributeNameAndFeature.get("FORM").toArray();
        String[] COLORS = (String[])CardAttribute.attributeNameAndFeature.get("COLORS").toArray();
       String[] FILL =(String[])CardAttribute.attributeNameAndFeature.get("FILL").toArray();
        Assert.assertTrue(FORME != null);
        Assert.assertTrue(COLORS != null);
        Assert.assertTrue(FILL != null);
    }
}
