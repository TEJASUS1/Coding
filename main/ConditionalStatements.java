package main;

public class ConditionalStatements {

    public static void main(String args[]) {
        ageChecker(18);
        ageChecker(6);

        genderChecker("FEMALE");


    }

    public static void ageChecker(int age) { //method creation

        if (age >= 18) {
            System.out.println("iam an adult");

        } else if (age >= 16 && age < 18) {
            System.out.println("iam close to adult");

        } else {
            System.out.println("im not an adult");
        }


    }
       /*==================Switch===============*/
    public static void genderChecker(String gender) {

        switch (gender) {
            case "FEMALE":
                System.out.println("Iam a female");
                break;
            case "Male":
                System.out.println("iam a Male");
                break;
            case "prefer not say ":
                System.out.println("prefered not to answer");
                break;

        }

    }
}
