package de.htwg.se.setgame.model;

import java.util.List;
import java.util.Map;

/**
 * Created by raina on 03.06.2015.
 */
public interface IGame {

	void setPlayerOne(IPlayer player1);
	
	void setPlayerTwo(IPlayer player2);

	void setCardsInField(Map<Integer, ICard> cardInField);

	void setUnusedCards(List<ICard> unusedCards);
	
	void setId(String id);
	
	void setCounter(int counter);

	IPlayer getPlayerOne();

	IPlayer getPlayerTwo();

	Map<Integer, ICard> getCardsInField();

	List<ICard> getUnusedCards();

	String getId();
	
	int getCounter();
}
