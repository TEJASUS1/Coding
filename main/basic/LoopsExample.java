package main.basic;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class LoopsExample {

    public static void main(String args[]){

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *

         */
        for (int i=0; i<=6; i++)
        {
            for (int j=0 ; j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
         */


        for (int i=1; i<=6; i++)
        {
            for (int j=1 ; j<=i;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }


        /*

        1
        2  2
        3  3  3
        4  4  4  4
        5  5  5  5  5
        6  6  6  6  6  6

         */

        for (int i=1; i<=6; i++)
        {
            for (int j=1 ; j<=i;j++)
            {
                System.out.print(i+"  ");
            }
            System.out.println();
        }



        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
         */
        for (int i=1; i<=6; i++)
        {

            int alphabet =65;
            for (int j=1 ; j<=i;j++)
            {
                System.out.print((char)alphabet+" ");
                alphabet++;
            }
            System.out.println();
        }



        /*
        A
        B B
        C C C
        D D D D
        E E E E E

         */
        int alphabet =65;
        for (int i=1; i<=6; i++)
        {
            for (int j=1 ; j<=i;j++)
            {

                System.out.print((char)alphabet+" ");

            }
            System.out.println();
            alphabet++;

        }

        /*
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for(int i =6; i>=0;i--){

            for (int j =0;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
        /*
          *
         ***
         *****
         *******
         *********
         */


        for(int i =1; i<=5;i++){

            for (int j =i;j<=5;j++){

                System.out.print(" ");
            }

            for(int j=1;j<i;j++)
            {
                System.out.print("*" );

            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();


        }




        for(int i =1; i<=5;i++){

            for (int j =i;j<=5;j++){

                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");

            }

//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j);
//            }

            System.out.println();


        }
        
        
        
        int numbers [] = {2,3,4,4,6};

        Arrays.stream(numbers).forEach(System.out::println);

        for (int i = 0; i < numbers.length; i++) {
            
        }

 //=============================WHILE LOOP=============================//
       int count =19;
        while(count<=20){
            System.out.println(count);
            count++;
        }
//=============================DO WHILE LOOP==========================//
        do{
            System.out.println(count);
            count++;
        }

        while(count<=20);








    }





//    public static void loopCheck(String value){
//
//        int [] numbers ={2,3,45,6,67,7,7,8};
//
//
//        for (int i=0; i<=1;i++){
//
//
//            System.out.println(numbers[i]);
//
//        }
//    }
}
