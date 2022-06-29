package main;

public class StringExample {
    public static void main(String args[]){
        String name = new String("sai");
        System.out.println(name.toLowerCase());
         name ="jeena";
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(4));


        String code = "code";
        String project ="CODE";
        System.out.println(project.contains("code"));
        System.out.println(project.equalsIgnoreCase(code));

    }
}
