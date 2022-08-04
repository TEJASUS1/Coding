package main;

public class ClassesAndObjects {

    public static void main(String args[]){
        Lens lensOne = new Lens("Sony","85mm",true);
        Lens lensTwo = new Lens("Cannon","75mm",false);

        System.out.println("Lens One");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println();
        System.out.println("Lens Two");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
    }

    static class Lens{

        String brand;
        String focalLength;
        boolean isPrime;
        Lens(String brand, String focalLength, boolean isPrime){
            this.brand=brand;
            this.focalLength= focalLength;
            this.isPrime=isPrime;


        }

    }
}
