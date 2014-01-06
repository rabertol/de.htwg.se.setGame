package setgame.controller;

import setgame.modell.impl.Card;

public interface IController {

	/* (non-Javadoc)
	 * @see setgame.controller.IController#spielModus()
	 */
	public abstract int spielModus();

	/* (non-Javadoc)
	 * @see setgame.controller.IController#isAset(setgame.modell.impl.Card, setgame.modell.impl.Card, setgame.modell.impl.Card, int)
	 */
	public abstract boolean isAset(Card cardOne, Card cardTwo, Card cardThree,
			int player);

}