package main.core.concepts;

public class ArrayOfObjects {

    public static void main(String args[]){

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Subway");

        Food[] fridge = {food1,food2,food3};
        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);


    }

    public static class Food{
        String name;
        Food(String name){
            this.name = name;

        }

    }

}


