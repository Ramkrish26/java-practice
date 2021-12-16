package com.challenges.sortedArray;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] myArray = new int[5];
        myArray = getIntegers(5);
        printArray(sortedIntegers(myArray));
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter "+num+" integers:");
        int[] values = new int[num];
        for (int i=0;i<num;i++){
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortedIntegers(int[] unSortedArray){
        int[] sortedArray = new int[unSortedArray.length];
        boolean flag = true;
        int temp;
        while (flag){
            flag=false;
            for(int i=0;i<unSortedArray.length-1;i++){
                if(unSortedArray[i] < unSortedArray[i+1]){
                    temp = unSortedArray[i];
                    unSortedArray[i] = unSortedArray[i+1];
                    unSortedArray[i+1] = unSortedArray[i];
                }
            }
        }

        return unSortedArray;
    }
}
