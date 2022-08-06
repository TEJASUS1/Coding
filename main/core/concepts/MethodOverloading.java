package main.core.concepts;

public class MethodOverloading {

    //over loading - Methods that share same name but different parameters


    public static void main(String args[]){

        System.out.println(add(1,3));
        System.out.println(add(1,3,6));


    }

    static int add(int a, int b ){


        return a+b;
    }

    static int add(int x, int y, int z){

        return x+y-z;
    }

}
