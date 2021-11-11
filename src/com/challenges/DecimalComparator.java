/*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places.
Otherwise, return false.*/

package com.challenges;

public class DecimalComparator {

    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        int firstNumber = (int) (num1 *1000d);
        int secondNumber = (int) (num2 *1000d);
        return (firstNumber == secondNumber) ? true : false;
    }
}
