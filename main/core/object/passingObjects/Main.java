package main.core.object.passingObjects;

public class Main {

    public static void main(String args[]){

        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car1 = new Car("Audi");
        Bicycle bicycle =new Bicycle("ThunderBird");

        garage.park(car);
        garage.park(car1);
        garage.park(bicycle);


    }
}
