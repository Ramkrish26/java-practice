package com.concepts.composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResoultion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResoultion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResoultion = nativeResoultion;
    }

    public void drawPixelAt(int x,int y, String color) {
        System.out.println("Drawing pixel at "+x+","+y+" in color "+color);
    }
}
