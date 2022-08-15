package main.core.concepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String args[]){
        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();

            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
