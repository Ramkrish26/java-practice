package com.concepts.sortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItems> stockList;

    public StockList() {
        this.stockList = new LinkedHashMap<>();
    }

    public StockItems get(String key){
        return stockList.get(key);
    }

    public Map<String,StockItems> stockItemsMap() {
        return Collections.unmodifiableMap(stockList);
    }

    public int addStock (StockItems item){
        if(item!=null){
            StockItems inStock = stockList.getOrDefault(item.getName(), item);
            if(inStock != item){
                item.adjustStock(inStock.getQuantityStock());
            }

            stockList.put(item.getName(),item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItems inStock = stockList.getOrDefault(item,null);

        if((inStock!=null)&&(inStock.getQuantityStock()>=quantity)&&quantity>0){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
