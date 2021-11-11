package com.challenges;

public class FeetAndInchesToCentimeters {

    public static void main (String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(1,1));
        System.out.println(calcFeetAndInchesToCentimeters(3));
    }

    public static int calcFeetAndInchesToCentimeters (double feet, double inches){
        if(feet >= 0 && (inches >=0 && inches <=12)){
            return (int)(((feet * 12) + inches) /2.54);
        } else {
            return -1;
        }
    }

    public static int calcFeetAndInchesToCentimeters (double inches){
        if(inches >=0 ){
            return (int)(inches/2.54);
        } else {
            return -1;
        }
    }
}
