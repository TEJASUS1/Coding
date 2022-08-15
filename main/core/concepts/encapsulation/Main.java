package main.core.concepts.encapsulation;

public class Main {


    public static void main(String args[]){

        Car car = new Car("chevorlet","camero",2022);

        System.out.println(car.getYear());

        car.setYear(2023);
        System.out.println(car.getYear());


    }
}
