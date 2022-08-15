package main.core.concepts.polymorphism;

public class Car extends Vehicle{


    @Override
    void go() {
        System.out.println("the car is in the race ");
    }

    void stop(){
        System.out.println("the car has trouble");
    }
}
