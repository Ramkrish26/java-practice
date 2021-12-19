package com.concepts.arrayList;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice){
                case 0: printInstructions();
                break;
                case 1: groceryList.printGroceryList();
                break;
                case 2:addItem();
                break;
                case 3:modifyItem();
                break;
                case 4:removeItem();
                break;
                case 5:searchForItem();
                break;
                case 6:quit=true;
                break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - TO search an item in the list.");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        String item = sc.nextLine();
        groceryList.addGroceryItem(item);
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter replacement item");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNumber = sc.nextInt();
        sc.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = sc.nextLine();
        if(groceryList.findItems(searchItem)!=null)
            System.out.println("Found "+ searchItem+" in the grocery list");
        else
            System.out.println(searchItem +" is not in the shopping list");
    }
}
