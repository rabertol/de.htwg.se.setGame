package de.htwg.se.setgame.model.impl;

import de.htwg.se.setgame.model.ACard;
import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;

/**
 * @author David Simon & Raina Bertolini
 * 
 */

public class Card extends ACard {
	private String color;
	private String form;
	private String panelFilling;
	private int anz;


    public Card(){

    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getColor()
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            set the color of a card
	 */
    @Override
	public void setColor(String color) {
		if (color.equals(CardAttribute.COLORS[0]) || color.equals(CardAttribute.COLORS[1])
				|| color.equals(CardAttribute.COLORS[2])) {
			this.color = color;
		} else {
			this.color = null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getFomr()
	 */
	@Override
	public String getForm() {
		return form;
	}

	/**
	 * @param form
	 *            set the form of the Card
	 * @throws IllegalArgumentException
	 *             if the form is not allowed
	 */
    @Override
	public void setForm(String form) {
		if (form.equals(CardAttribute.FORM[2]) || form.equals(CardAttribute.FORM[0])
				|| form.equals(CardAttribute.FORM[1])) {
			this.form = form;
		} else {
			this.form = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getPanelFilling()
	 */
	@Override
	public String getPanelFilling() {
		return panelFilling;
	}

	/**
	 * @param panelFilling
	 *            filling of the card
	 * @throws IllegalArgumentException
	 *             if filling is not allowed
	 */
    @Override
	public void setPanelFilling(String panelFilling) {
		if (panelFilling.equals(CardAttribute.FILL[0])
				|| panelFilling.equals(CardAttribute.FILL[1])
				|| panelFilling.equals(CardAttribute.FILL[2])) {
			this.panelFilling = panelFilling;
		} else {
			this.panelFilling = null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getNumberOfComponents()
	 */
	public int getNumberOfComponents() {
		return anz;
	}

	/**
	 * @param numberOfComponents
	 * @throws IllegalArgumentException
	 *             if numberOfComponents is not allowed
	 */
    @Override
	public void setNumberOfComponents(int numberOfComponents) {
		if (numberOfComponents == CardAttribute.NUMBEROFCOMPONET[0]
				|| numberOfComponents == CardAttribute.NUMBEROFCOMPONET[1]
				|| numberOfComponents == CardAttribute.NUMBEROFCOMPONET[2]) {
			this.anz = numberOfComponents;

		} else {
			this.anz = -1;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|" + this.color + "| \n " + "|" + this.form + "| \n " + "|"
				+ this.panelFilling + "| \n " + "|" + this.anz + "|\n");
		return sb.toString();
	}



	@Override
	public boolean compareTo(ICard card) {

		if (this.color.equals(card.getColor()) && this.anz == card.getNumberOfComponents()
				&& this.form.equals(card.getForm())
				&& this.panelFilling.equals(card.getPanelFilling())) {
			return true;
		}
		return false;

	}
}
