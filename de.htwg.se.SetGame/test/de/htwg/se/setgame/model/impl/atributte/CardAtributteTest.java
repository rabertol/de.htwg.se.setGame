package de.htwg.se.setgame.model.impl.atributte;

import javassist.Modifier;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

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
        Map<String,List<String>> cardAttributes= CardAttribute.attributeNameAndFeature;
        Assert.assertTrue(cardAttributes != null);
    }
}
