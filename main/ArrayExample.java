package main;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String args[]){

        int [] numbers = {2,3,45,5,6,7};

        int value = numbers[numbers.length-1];

        System.out.println(value);

        String [] names = {"si","jeena"};
        if(names[0].contains("a")){
            System.out.println("present");


        }else {
            System.out.println("not present");
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
    }
}
