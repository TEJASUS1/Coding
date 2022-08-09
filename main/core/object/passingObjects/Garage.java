package main.core.object.passingObjects;

public class Garage {

    void park(Car car){
        System.out.println("your " +car.name+" is parked in the garage" );
    }

    void park(Bicycle bicycle){
        System.out.println("your " +bicycle.name+" is parked in the garage" );
    }
}
