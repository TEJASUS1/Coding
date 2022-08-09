package main.core.concepts.Super;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name= name;
        this.age= age;

    }

    public  String fly(){
        return this.name + "\n" + this.age + "\n";

    }
}
