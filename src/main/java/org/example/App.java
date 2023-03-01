package org.example;

import java.util.stream.Collectors;

public class App {
    public void estadoVacio(String texto){
        System.out.println(texto.isBlank());
    }
    public void repetir(String texto,int cantidad){
        var repetido= texto.repeat(cantidad);
        System.out.println(repetido);
    }
    public void convertirLista(String texto){
        System.out.println(texto.lines().collect(Collectors.toList()));
    }
    public void removerEspacios(String texto){
        //al inicio y al final
        System.out.println(texto.strip());
        System.out.println(texto.stripLeading());
        System.out.println(texto.stripTrailing());
        System.out.println(texto.trim());

    }
    public static void main(String[] args) {

       App app = new App();
       app.estadoVacio("Mito Code");
       app.repetir("Mitocode",3);
       app.convertirLista("1,2,3,4");
       app.removerEspacios(" Mito Code ");
       //https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11
    }
}