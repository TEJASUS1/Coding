package main.core.object;

public class Main {

    public static void main(String args[]){

        Car car = new Car();
        System.out.println(car.colour);
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);

        car.drive();
        car.brake();
    }
}
