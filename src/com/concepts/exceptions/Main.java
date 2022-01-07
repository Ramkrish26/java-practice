package com.concepts.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int x= 98,y=0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));*/

        System.out.println(getIntLBYL());
        System.out.println(getIntEAFP());
    }

    private static int getIntLBYL(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean isValid = true;

        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid =false;
                break;
            }
        }
        if(isValid)
            return Integer.parseInt(input);
        return 0;
    }

    private static int getIntEAFP(){
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }

    // Look before you leap approach
    private static int divideLBYL(int x, int y){
        if(y!=0)
            return x/y;
        else
            return 0;
    }

    // Easy to ask forgiveness than permission approach
    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
}
