package de.htwg.se.setgame.model;
public interface ICard {
/**
* @return form
 */
	String getForm();
	/**
     *
     * @param form of card
     */
    void setForm(String form);
/**
* @return color
 */
	String getColor();
	/**
     *
     * @param color of card
     */
    void setColor(String color);
/**
* @return numberOfComponents
 */
	String getNumberOfComponents();
	/**
     *
     * @param numberOfComponents of card
     */
    void setNumberOfComponents(String numberOfComponents);
/**
* @return texture
 */
	String getTexture();
	/**
     *
     * @param texture of card
     */
    void setTexture(String texture);
    /**
	 * @param card 
	 * @return true if card is the same
	 */
	boolean compareTo(ICard card);

}
