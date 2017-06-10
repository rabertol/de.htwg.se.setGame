package de.htwg.se.setgame.util.persistence.hibernate;

import de.htwg.se.setgame.model.ICard;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author David Simon & Raina Bertolini
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
    private String anz;

    public PersistentCard() {
    }

    ;


    /*
     * (non-Javadoc)
     *
     * @see de.htwg.se.setgame.modell.impl.ICard#getColor()
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color set the color of a card
     */
    public void setColor(String color) {

        this.color = color;


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
     * @param form set the form of the Card
     * @throws IllegalArgumentException if the form is not allowed
     */
    public void setForm(String form) {

        this.form = null;

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
     * @param panelFilling filling of the card
     * @throws IllegalArgumentException if filling is not allowed
     */
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
     * @throws IllegalArgumentException if numberOfComponents is not allowed
     */
    public void setNumberOfComponents(String numberOfComponents) {

        this.anz = numberOfComponents;

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
