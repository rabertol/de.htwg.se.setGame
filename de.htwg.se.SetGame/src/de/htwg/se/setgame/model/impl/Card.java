package de.htwg.se.setgame.model.impl;
import de.htwg.se.setgame.model.ICard;
public class Card implements ICard {
	private String form;
	private String numberOfComponents;
	private String color;
	private String bla;
	 /**
	 * @return form
	 */
	@Override
	public String getForm(){
		return this.form;
	}
    /**
     *
     * @param form of card
     */
    @Override
    public void setForm(String form){
    	this. form =  form;
	}
	 /**
	 * @return numberOfComponents
	 */
	@Override
	public String getNumberOfComponents(){
		return this.numberOfComponents;
	}
    /**
     *
     * @param numberOfComponents of card
     */
    @Override
    public void setNumberOfComponents(String numberOfComponents){
    	this. numberOfComponents =  numberOfComponents;
	}
	 /**
	 * @return color
	 */
	@Override
	public String getColor(){
		return this.color;
	}
    /**
     *
     * @param color of card
     */
    @Override
    public void setColor(String color){
    	this. color =  color;
	}
	 /**
	 * @return bla
	 */
	@Override
	public String getBla(){
		return this.bla;
	}
    /**
     *
     * @param bla of card
     */
    @Override
    public void setBla(String bla){
    	this. bla =  bla;
	}
    /**
	 * @param card 
	 * @return true if card is the same
	 */
	@Override
	public boolean compareTo(ICard card){
		if (
		this.form.equals(card.getForm()) && 
		this.numberOfComponents.equals(card.getNumberOfComponents()) && 
		this.color.equals(card.getColor()) && 
		this.bla.equals(card.getBla()) ) {
			return true;
		}
		return false;
	}

}

