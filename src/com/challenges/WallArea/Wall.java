package com.challenges.WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0.00d,0.00d);
    }

    public Wall(double width, double height) {
        if(width < 0.00d && height > 0.00d){
            this.width = 0.00d;
            this.height = height;
        }

        if(height < 0.00d && width > 0.00d){
            this.width = width;
            this.height = 0.00d;
        }

        if(height < 0.00d && width < 0.00d){
            this.width = 0.00d;
            this.height = 0.00d;
        }

        if(width >= 0.00d && height >= 0.00d){
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width < 0.00d)
            this.width = 0.00;
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if(height < 0.00d)
            this.height = 0.00d;
        else
            this.height = height;
    }

    public double getArea (){
        return this.height * this.width;
    }
}
