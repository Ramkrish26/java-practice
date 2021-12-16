package com.challenges;

public class ArrayReverse {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5};
        int temp;
        int maxIndex = myArray.length-1;
        int halfArrayLen = myArray.length/2;
        for(int i=0;i<halfArrayLen;i++){
            temp = myArray[i];
            myArray[i] = myArray[maxIndex-i];
            myArray[maxIndex-i] = temp;
        }
        for (int i=0;i<myArray.length;i++)
            System.out.println(myArray[i]);
    }
}
