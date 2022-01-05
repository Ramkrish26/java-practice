package com.challenges;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int n = 372;
        int temp = n;
        int digits =0,last=0,sum=0;
        while(temp>0){
            temp /= 10;
            digits++;
        }

        temp=n;
        while(temp>0){
            last =temp% 10;
            sum+=Math.pow(last,digits);
            temp /= 10;
        }

        if(sum==n)
            System.out.println("Armstrong number");
    }
}
