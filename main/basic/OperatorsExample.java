package main.basic;

import java.sql.SQLOutput;

public class OperatorsExample {
    public static void main(String args[]) {

        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 % 2);
        System.out.println(10 / 2);
        System.out.println((10 + 2) / 4 * 2 + 1 - 3); //BODMAS RULE


        System.out.println(Math.max(20, 49));
        System.out.println(Math.PI);
        System.out.println((int) Math.pow(2, 4));


        /*========================COMAPARASION OPERATORS===========================*/

        int jeenaAge= 28;
        int saiAge = 26;

        System.out.println(jeenaAge>saiAge);
        System.out.println(jeenaAge<saiAge);
        System.out.println(jeenaAge==saiAge);

        /*========================COMAPARASION OPERATORS===========================*/

        Boolean isAdult = false;
        Boolean isStudent = true;

        System.out.println(!isAdult && isStudent);
        System.out.println(isAdult || isStudent);

        String name = "mark";
        System.out.println((isAdult || isStudent) && 10>9 && name.contains("m") );


        /*========================Terenary OPERATORS===========================*/

        int age = 19;

        String message = age>=18 ? "iam an adult " : "iam not an adult";

        System.out.println(message);








    }



}

