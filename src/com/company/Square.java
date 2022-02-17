package com.company;

public final class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);  //What goes here?

    }

    public double getSideLength(){
        return this.length;
    }

    public double setSideLength(double length){
        return this.length = length;
    }

}
