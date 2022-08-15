package main.core.concepts.Static;

public class Friend {

    String name;
       static int numberOfFriends;

    Friend(String name){
        this.name= name;
        numberOfFriends++;

    }

     static void displayFriends(){
        System.out.println("you have " + numberOfFriends + " Friends");
        System.out.println(Math.round(2.34));
    }
}
