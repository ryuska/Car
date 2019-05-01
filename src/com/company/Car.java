package com.company;

public class Car {
    private String make;
    private String model;
    private String speed;
    private String color;


    public Car(){
        System.out.println("A new car!");

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String a) {
        this.color = a;
    }

    public void start() {
        System.out.println( "The "+ getColor() + " " + getMake() + " " + getModel() + " is starting");
    }
    public String accelerate() {
        return " The "+ getColor() + " " + getMake() + " " + getModel() + " is accelerating";
    }
    public String getMph() {
        return "The "+ getColor() + " " + getMake() + " " + getModel() + "  is going" + " " + getSpeed() + " mph";
    }
    public String stop() {
        return "The"+ getColor() + " " + getMake() + " " + getModel() + " has stopped";

    }
    public String emission() {
        return "The " + getColor() + " " + getMake() + " " + getModel() + " has stopped to have its emmision cheched";
    }
    public String passemission(){
        return "The " + getColor() + " " + getMake() + " " + getModel() + " passes its emission test";
    }
}
