package com.company;



public class CarApp {
    public static void main (String[] args){
        Car a = new Car();
        a.setMake("Porshe");
        a.setModel("CV");
        a.setSpeed("90");
        a.setColor("Red");
        a.start();
        System.out.println(a.accelerate());
        System.out.println(a.getMph());
        System.out.println(a.stop());



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
//        print(a.accelerate());
//        print(a.go());
//        print(a.stop());
//
//        Porshe b = new Porshe();
//        print(b.start());
//        print(b.accelerate());
//        print(a.go());
//



    }
    private static void print(String s){
        System.out.println(s);
    }


}
