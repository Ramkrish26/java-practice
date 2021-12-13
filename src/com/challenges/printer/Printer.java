package com.challenges.printer;

public class Printer {
    private int tonerLevel = -1;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel<=100)
            this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner (int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if((this.tonerLevel+tonerAmount) > 100)
                return -1;
            else
                return this.tonerLevel += tonerAmount;
        }else
            return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            return this.pagesPrinted=pagesToPrint/2;
        }
        else
            return pagesToPrint;
    }
}
