package com.concepts.collectionsOverview;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        language.put("Java","High level, Objet oriented language");
        language.put("Python","Interpreted oop Language");
        language.put("Algol","al algorithmic language");
        language.put("BASIC","All purposes symbolic instruction code");
        language.put("Lisp","There in lies madness");

        System.out.println(language.get("Java"));

        for(String key: language.keySet()){
            System.out.println(language.get(key));
        }
    }
}
