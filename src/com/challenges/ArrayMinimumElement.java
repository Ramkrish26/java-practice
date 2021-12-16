package com.challenges;

import java.util.Scanner;

public class ArrayMinimumElement {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("The minimum value in array is "+ findMin(readElements(readInteger())));
    }
    private static int readInteger(){
        System.out.println("Enter no of elements needed:");
        int num = sc.nextInt();
        return num;
    }
    private static int[] readElements(int num){
        int[] myArray = new int[num];
        System.out.println("Enter the elements");
        for (int i=0;i<num;i++){
            myArray[i] = sc.nextInt();
        }
        return myArray;
    }
    private static int findMin(int[] arrayValues){
        int min=arrayValues[0];
        for(int i=1;i<arrayValues.length;i++){
            if(arrayValues[i]<min)
                min=arrayValues[i];
        }
        return min;
    }
}
