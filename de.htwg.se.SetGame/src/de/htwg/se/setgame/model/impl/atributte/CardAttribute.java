package de.htwg.se.setgame.model.impl.atributte;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by raina on 03.06.2015.
 */
public final class CardAttribute {
    private CardAttribute(){

    }
    public static Map<String,List<String>> attributeNameAndFeature;
    public int FIELDSIZE = 12;
    private static final String[] FORM = { "ovally", "wave", "balk" };
    private static final String[] COLORS = { "red", "green", "purple" };
    private static final String[] FILL = { "halffill", "fill", "empty" };
    private static final String[] NUMBEROFCOMPONET = { "1", "2", "3" };
    static {
        attributeNameAndFeature = new HashMap<String, List<String>>();
        addNewAttribute(FORM, "FORM");
        addNewAttribute(COLORS, "COLORS");
        addNewAttribute(FILL, "FILL");
        addNewAttribute(NUMBEROFCOMPONET, "NUMBEROFCOMPONET");

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

}
