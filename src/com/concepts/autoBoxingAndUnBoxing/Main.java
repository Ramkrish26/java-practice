package com.concepts.autoBoxingAndUnBoxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
            integerArrayList.add(Integer.valueOf(i)); //Auto boxing
        for(int i=0;i<10;i++)
            System.out.println(integerArrayList.get(i).intValue()); //Unboxing
    }
}
