
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
    private static final String[] form = {"wave", "balk"};
    private static final String[] numberOfComponents = {"one", "two", "three"};
    private static final String[] color = {"red", "blue", "green", "yellow"};
    private static final String[] bla = {"bla", "blabla", "blablabla"};
    static {
        attributeNameAndFeature = new HashMap<>();
        addNewAttribute(form, "form");
        addToFieldSize(form);
        addNewAttribute(numberOfComponents, "numberOfComponents");
        addToFieldSize(numberOfComponents);
        addNewAttribute(color, "color");
        addToFieldSize(color);
        addNewAttribute(bla, "bla");
        addToFieldSize(bla);
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
