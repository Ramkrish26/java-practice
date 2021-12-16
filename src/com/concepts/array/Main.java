package com.concepts.array;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int[] myArray = getIntegers(5);
        int sum=0;
        for (int i=0;i<myArray.length;i++){
            sum += myArray[i];
        }
        System.out.println("The average of numbers is "+sum/5);
    }

    public static int[] getIntegers (int num){
        System.out.println("Enter "+num+" integer values : \r");
        int[] values = new int[num];
        for (int i=0;i<values.length;i++){
            values[i] = sc.nextInt();
        }
        return values;
    }
}
