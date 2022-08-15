package main.core.concepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String args[]){
        try {
            FileWriter writer =new FileWriter("poem.txt");
            writer.write("roses are red \nhello world are you there");
            writer.append("(append method)");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
