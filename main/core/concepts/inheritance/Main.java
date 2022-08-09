package main.core.concepts.inheritance;

public class Main {

    public static void main(String args[]){
        Car car = new Car();
        car.go();
        car.stop();


        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);

    }
}
