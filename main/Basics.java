package main;

import java.time.LocalDate;

public class Basics {

    public static void main(String args[]) {

        byte theByte = -128;
        short theShort= -32000;
        int number = 100;
        char ch ='c';
        float fl= 3.4f;
        double db= 444;
        long l = 3L;
        boolean b= true;

        /* Reference Types*/
        String name = new String("Sai");
        System.out.println(name.toLowerCase());
        LocalDate now =  LocalDate.now();
        System.out.println(now);
        System.out.println(now.isLeapYear());



        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(number);
        System.out.println(ch);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(l);
        System.out.println(b);








    }
}
