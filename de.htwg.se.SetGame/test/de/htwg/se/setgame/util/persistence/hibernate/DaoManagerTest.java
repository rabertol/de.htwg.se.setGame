package de.htwg.se.setgame.util.persistence.hibernate;

import javassist.Modifier;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;


/**
 * Created by raina on 16.06.2015.
 */
public class DaoManagerTest {

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = DaoManager.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
    @Test
    public void getDaoManagerSession_ok(){
        Session session = DaoManager.getSession();
        Assert.assertTrue(session != null);
        session.close();
    }
}

