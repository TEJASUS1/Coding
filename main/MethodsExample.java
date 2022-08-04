package main;

import java.util.Arrays;

public class MethodsExample {

    public static void main(String args[]) {

        String brand = "samsung";
        String test = brand.toUpperCase();
        System.out.println(brand.toUpperCase());
        System.out.println(test.startsWith("S"));
        System.out.println(test.endsWith("g"));

        char[] letters = {'A', 'B', 'A', 'C', 'D', 'D', 'D'};
        int count = countOccurences(letters, 'A');
        System.out.println(count);

    }


    public static int countOccurences(char[] letters, char searchLetter) {

        int count = 0;
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }

        return count;
    }

}
