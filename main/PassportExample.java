package main;

public class PassportExample {
//==================================Simple Project===========================//
    public static void main(String args[]){

        Passport candidate = new Passport("P232424","SAI TEJA","INDIA");

        System.out.println(candidate.id);
        System.out.println(candidate.fullName);
        System.out.println(candidate.country);

    }

    static class Passport{

        String id;
        String fullName;
        String country;

        Passport(String id,String fullName,String country){
            this.id=id;
            this.fullName=fullName;
            this.country=country;
        }
    }
}
