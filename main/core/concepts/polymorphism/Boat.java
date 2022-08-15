package main.core.concepts.polymorphism;

public class Boat extends Vehicle{

    @Override
    void go() {
        System.out.println("the Boat is in the race ");
    }
}
