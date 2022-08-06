package main.basic;

public class RefrenceTypes {

    public static void main(String args[]){
        person sai = new person("sai");
        person jeena = sai;

        System.out.println(sai.name +" && "+ jeena.name);
        System.out.println("after changing");

        jeena.name = "jo";
        System.out.println(sai.name +" && "+ jeena.name);

    }


    static class person{
        String name;
        person(String name){
            this.name = name;
        }

    }
}
