package de.htwg.se.setgame.util.persistence.couchdb;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.htwg.se.setgame.SetGameModule;
import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.IGame;
import de.htwg.se.setgame.model.IModelFactory;
import de.htwg.se.setgame.model.IPlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by raina on 16.06.2015.
 */
public class GameDaoTest {
    private GameDao target;
    private IGame game;
    private IModelFactory modelFactory;
    @Before
    public void setUp(){


        Injector injector = Guice.createInjector(new SetGameModule());
        this.modelFactory = injector.getInstance(IModelFactory.class);
        target = new GameDao();
        IPlayer playerOne = modelFactory.createPlayer();
        playerOne.setCounter(4);
        playerOne.setPid(0);

        IPlayer playerTwo = modelFactory.createPlayer();
        playerTwo.setCounter(3);
        playerTwo.setPid(2);

        int counter = 4;

        Map<Integer, ICard> cardsInField = new HashMap<Integer, ICard>();
        ICard cardfield = modelFactory.createCard();
        cardfield.setColor("red");
        cardfield.setNumberOfComponents(1);
        cardfield.setForm("wave");
        cardfield.setPanelFilling("fill");
        cardsInField.put(0, cardfield);

        ICard card = modelFactory.createCard();
        card.setColor("green");
        card.setNumberOfComponents(1);
        card.setForm("wave");
        card.setPanelFilling("fill");

        List<ICard> unusedCards = new LinkedList<ICard>();
        unusedCards.add(card);
        // generate unique id
        String uid = "b3192b4a-55ba-4adc-9047-764778fd89c9";

        this.game = modelFactory.createGame();
        game.setId(uid);
        game.setPlayerOne(playerOne);
        game.setPlayerTwo(playerTwo);
        game.setCounter(counter);
        game.setCardsInField(cardsInField);
        game.setUnusedCards(unusedCards);
    }
    @Test
    public void createOrUpdateGameTest(){
        target.createOrUpdateGame(game);
        Assert.assertTrue(game.getId() != null);

    }
    @Test
    public void findGameTest(){
        String uid = "b3192b4a-55ba-4adc-9047-764778fd89c9";
        game.setId(uid);
        target.createOrUpdateGame(game);
        IGame result = target.findGame(game.getId());
        Assert.assertTrue(result != null);
        target.closeDb();


    }
    @Test
    public void createNewGameTest(){
        String uid = UUID.randomUUID().toString();
        game.setId(uid);
        target.createOrUpdateGame(game);
        Assert.assertTrue(game.getId().equals(uid));


    }
    @Test
    public void createNewGameTestAndUpDate(){
        String uid = UUID.randomUUID().toString();
        game.setId(uid);
        target.createOrUpdateGame(game);
        Assert.assertTrue(game.getId().equals(uid));
        game.getPlayerOne().setCounter(10);
        game.getPlayerTwo().setCounter(11);
        game.setCounter(21);
        target.createOrUpdateGame(game);
        IGame result = target.findGame(uid);
        Assert.assertTrue(result.getPlayerOne().getCounter() == 10);
        Assert.assertTrue(result.getPlayerTwo().getCounter() == 11);
        Assert.assertTrue(result.getCounter() == 21);
    }
    @Test
    public void closeDbTest(){
        CouchDBSession.getCouchDbConnector();



    }




}
