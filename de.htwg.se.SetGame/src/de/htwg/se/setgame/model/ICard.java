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
	 * @return numberOfComponents
	 */
	String getNumberOfComponents();
    /**
     *
     * @param numberOfComponents of card
     */
    void setNumberOfComponents(String numberOfComponents);
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
	 * @return bla
	 */
	String getBla();
    /**
     *
     * @param bla of card
     */
    void setBla(String bla);
    /**
	 * @param card
	 * @return true if card is the same
	 */
	boolean compareTo(ICard card);

}

