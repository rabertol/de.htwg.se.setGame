package de.htwg.se.setgame.model.impl;
import de.htwg.se.setgame.model.ICard;
public class Card implements ICard {
	private String form;	private String color;	private String numberOfComponents;	private String texture;
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
	 * @return texture
	 */
	@Override
	public String getTexture(){
		return this.texture;
	}
	/**
	 *
	 * @param texture of card
	*/
	@Override
	public void setTexture(String texture){
		this. texture =  texture;
	}
    /**
	 * @param card 
	 * @return true if card is the same
	 */
	@Override
	public boolean compareTo(ICard card){
		if (
		this.form.equals(card.getForm()) && 
		this.color.equals(card.getColor()) && 
		this.numberOfComponents.equals(card.getNumberOfComponents()) && 
		this.texture.equals(card.getTexture()) ) {
			return true;
		}
		return false;
	}

}

