package org.example.lambdas;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Archivo {
    public void leer(){
        try{
            String contenido = Files.readString(Path.of("C:/prueba.txt"));

        }catch(Exception e){
          e.printStackTrace();
        }
    }
    public void escribir(){
        try{
         Path path = Files.writeString(Path.of("C:\\prueba.txt"),"Desde JDK 11", StandardOpenOption.CREATE_NEW);
         System.out.println(path);
         String s = Files.readString(path);
         System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
