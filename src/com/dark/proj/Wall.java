package com.dark.proj;

public class Wall {

    private double height;
    private double width;

    public Wall() {
        this(0,0);
    }
    public Wall(double height, double width) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
        else {
            this.width = 0;
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
        else {
            this.height = 0;
        }
    }
    public double getArea() {
        return this.height * this.width;
    }
}

