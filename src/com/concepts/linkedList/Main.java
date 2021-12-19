package com.concepts.linkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Customer cust = new Customer("Ram",100.24);
        Customer cust2;
        cust2 = cust;
        cust2.setBalance(12.2);
        System.out.println("Balance for customer "+cust.getName()+" is "+cust.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for(int i=0;i<integerArrayList.size();i++)
            System.out.println(i+" : "+integerArrayList.get(i));

        integerArrayList.add(1,2);

        for(int i=0;i<integerArrayList.size();i++)
            System.out.println(i+" : "+integerArrayList.get(i));
    }
}
