package main.core.concepts;

import java.io.File;

public class FileExample {

    public static void main(String args[]){
        File file = new File("poem.txt");
        if(file.exists()){
            System.out.println("the File exists ");
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            file.delete();


        }
        else{
            System.out.println("the file doesn't exits");
        }
    }
}
