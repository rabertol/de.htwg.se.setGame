package de.htwg.se.setgame.model.impl;

import de.htwg.se.setgame.model.ACard;
import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;

import java.util.Map;

/**
 * @author David Simon & Raina Bertolini
 * 
 */

public class Card extends ACard {
	private String color;
	private String form;
	private String panelFilling;
	private String anz;


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

			this.color = color;


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
			this.form = form;

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

			this.panelFilling = panelFilling;


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getNumberOfComponents()
	 */
	public String getNumberOfComponents() {
		return anz;
	}

	/**
	 * @param numberOfComponents
	 * @throws IllegalArgumentException
	 *             if numberOfComponents is not allowed
	 */
    @Override
	public void setNumberOfComponents(String numberOfComponents) {

			this.anz = numberOfComponents;


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

		if (this.color.equals(card.getColor()) && this.anz.equals(card.getNumberOfComponents())
				&& this.form.equals(card.getForm())
				&& this.panelFilling.equals(card.getPanelFilling())) {
			return true;
		}
		return false;

	}
}
