
package de.htwg.se.setgame.model.impl.atributte;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public final class CardAttribute {
    private CardAttribute(){
    }
    public static int FIELDSIZE = 1;
    public static Map<String,List<String>> attributeNameAndFeature;
    private static final String[] form = {"elipse", "oval", "retangle", "circle"};
    private static final String[] color = {"red", "green", "purple", "blue"};
    private static final String[] numberOfComponents = {"one", "two", "three"};
    private static final String[] texture = {"twoD", "threeD"};
    static {
    	attributeNameAndFeature = new HashMap<>();
        addNewAttribute(form, "form");
        addToFieldSize(form);
        addNewAttribute(color, "color");
        addToFieldSize(color);
        addNewAttribute(numberOfComponents, "numberOfComponents");
        addToFieldSize(numberOfComponents);
        addNewAttribute(texture, "texture");
        addToFieldSize(texture);
    }
    private static void addNewAttribute(String[] array,String name){
        attributeNameAndFeature.put(name, new LinkedList<String>());
        addArray(array, name);
    }
    private static void addArray(String[] array, String name){
        for(String v : array){
            attributeNameAndFeature.get(name).add(v);
        }
    }
    private static void addToFieldSize(String[] array){
        FIELDSIZE = FIELDSIZE * array.length;
    }
}
