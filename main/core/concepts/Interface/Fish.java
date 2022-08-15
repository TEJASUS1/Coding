package main.core.concepts.Interface;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("the fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("the fish is running from larger fish");
    }
}
