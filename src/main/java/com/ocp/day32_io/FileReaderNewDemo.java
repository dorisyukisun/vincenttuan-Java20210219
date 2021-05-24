package com.ocp.day32_io;

// 利用 try-with-resource

import java.io.FileReader;
import java.io.IOException;

public class FileReaderNewDemo {
    public static void main(String[] args) {
        String path = "src/main/java/com/ocp/day32_io/data.txt";
        
        try(FileReader fr = new FileReader(path)) {
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }
        }  catch (IOException e1) {
            System.out.println(e1);
        } 
    }
}
