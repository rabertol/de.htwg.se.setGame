package de.htwg.se.setgame.util.persistence.hibernate;

import de.htwg.se.setgame.model.ICard;
import de.htwg.se.setgame.model.impl.atributte.CardAttribute;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author David Simon & Raina Bertolini
 * 
 */

@Entity
@Table(name = "setgame_card")
public class PersistentCard implements Serializable, ICard {

	private static final long serialVersionUID = 4706387443241003922L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardID;

    public Long getCardID() {
        return cardID;
    }

    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String form;
    @Column(nullable = false)
    private String panelFilling;
    @Column(nullable = false)
    private int anz;

	public PersistentCard() {};


	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg.se.setgame.modell.impl.ICard#getColor()
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            set the color of a card
	 */
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
	public String getForm() {
		return form;
	}

	/**
	 * @param form
	 *            set the form of the Card
	 * @throws IllegalArgumentException
	 *             if the form is not allowed
	 */
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
	public String getPanelFilling() {
		return panelFilling;
	}

	/**
	 * @param panelFilling
	 *            filling of the card
	 * @throws IllegalArgumentException
	 *             if filling is not allowed
	 */
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
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|" + this.color + "| \n " + "|" + this.form + "| \n " + "|"
				+ this.panelFilling + "| \n " + "|" + this.anz + "|\n");
		return sb.toString();
	}



	public boolean compareTo(ICard card) {

		if (this.color.equals(card.getColor()) && this.anz == card.getNumberOfComponents()
				&& this.form.equals(card.getForm())
				&& this.panelFilling.equals(card.getPanelFilling())) {
			return true;
		}
		return false;

	}


}
