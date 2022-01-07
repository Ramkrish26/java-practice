package com.concepts.sortedCollections;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItems temp = new StockItems("Bread",10,100);
        stockList.addStock(temp);

        temp = new StockItems("Butter",36,100);
        stockList.addStock(temp);

        temp = new StockItems("Jam",40,150);
        stockList.addStock(temp);

        System.out.println(stockList);
    }
}
