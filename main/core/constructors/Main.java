package main.core.constructors;

public class Main {

    public static void main(String args[]){

        Human human1 = new Human("sai",26,70);
        Human human2 = new Human("jeena",29,54);

        System.out.println(human1.name);
        human1.eat();
        human2.drink();
    }
}
