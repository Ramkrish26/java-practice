package com.challenges;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(-5.6);
    }

    public static long toMilesPerHour (double kilometresPerHour){
        if(kilometresPerHour < 0){
            return -1;
        }
        return Math.round(kilometresPerHour / 1.609);
    }

    public static void printConversion (double kilometresPerHour){
        if(kilometresPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + " Km/h = "+milesPerHour +" mi/h");
        }
    }
}
