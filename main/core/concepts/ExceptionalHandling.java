package main.core.concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandling {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        try {


            System.out.println("enter the whole number : ");
            int x = scanner.nextInt();
            System.out.println("enter the whole number to divide : ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("the result : " + z);
        } catch (ArithmeticException e) {
            System.out.println("You cannot enter the number zero :( ");


        }
        catch(InputMismatchException e){
            System.out.println("you cannot enter the non-anumeric values");


        }
        catch(Exception e){
            System.out.println("the input value is wrong");

        }

        finally {
            scanner.close();
            System.out.println("cleaning the file ");
        }


    }
}
