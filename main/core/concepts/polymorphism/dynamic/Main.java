package main.core.concepts.polymorphism.dynamic;

import java.util.Scanner;

public class Main {
public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    Human human;

   // Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your gender");

    String choice = scanner.nextLine();

    if(choice.equalsIgnoreCase("male")) {
        human = new Male();
        human.emotion();

    }
    else if(choice.equalsIgnoreCase("female")){
        human = new Female();
        human.emotion();

    }
    else{
        human = new Human();
        System.out.println("no data");
        human.emotion();
    }


}
}
