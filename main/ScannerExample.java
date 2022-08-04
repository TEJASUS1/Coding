package main;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your NAME ");

        String userName = scanner.nextLine();
        System.out.println(" HELLO " + userName);

        System.out.println("How old are you?");

        int old = scanner.nextInt();

        System.out.println("age " + old);

        int age = LocalDate.now().minusYears(old).getYear();

        System.out.println("you were born in " + age);

        if (age < 18) {
            System.out.println("you are not an adult");
        } else {
            System.out.println("you are an adult");
        }






    }
}
