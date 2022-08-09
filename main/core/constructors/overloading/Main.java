package main.core.constructors.overloading;

public class Main {

    public static void main(String args[]){
        Pizza pizza = new Pizza("Thick crust","Tomato","Mozerella","Mushroom");

        System.out.println("Here are the ingredients in your Pizza :");
        System.out.println(pizza.bread+", "+pizza.sauce+", "+pizza.cheese+", "+pizza.topping);
    }
}
