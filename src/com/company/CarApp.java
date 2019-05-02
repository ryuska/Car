package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        int i;
        for (i = 0; i < 3; i++) {
            Car a = new Car();
//        a.setMake("Porshe");
//        a.setModel("CV");
//        a.setSpeed("90");
//        a.setColor("Red");
//        a.start();
//        System.out.println(a.accelerate());
//        System.out.println(a.getMph());
//        System.out.println(a.stop());
            System.out.println("Please enter your car type? ");
            String type = input.next();
            a.setMake(type);
            System.out.println("Please enter your car model? ");
            String model = input.next();
            a.setModel(model);
            System.out.println("What is your car speed? ");
            String speed = input.next();
            a.setSpeed(speed);
            System.out.println("What is color of your car? ");
            String color = input.next();
            a.setColor(color);
            cars.add(a);

            for (Car x : cars) {
//            System.out.println(x.getMake());
//            System.out.println(x.getModel());
//            System.out.println(x.getSpeed());
//            System.out.println(x.getColor());
                System.out.println(x.getDescription());

            }
        }


/*
        Car b = new Car();
        b.setMake("Jetta");
        b.setModel("X");
        b.setSpeed("30");
        b.setColor("blue");
        b.start();
        System.out.println(b.accelerate());
        System.out.println(b.getMph());
        System.out.println(b.stop());
        System.out.println((b.emission()));
        System.out.println(b.passemission());
        */
//        addCars(b, vroom);

//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(a) {

    }
}









