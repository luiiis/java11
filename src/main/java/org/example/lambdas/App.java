package org.example.lambdas;

import java.util.stream.IntStream;

public class App {

    public void probar(String seleccion){
        //pares impares
        switch (seleccion){
            case "PAR":
                IntStream.of(1,2,3,4,5,6,7).filter((var i)->i % 2 == 0).forEach(System.out::println);
                break;
            case "IMPAR":
                IntStream.of(1,2,3,4,5,6,7).filter((var i)->i % 2 != 0).forEach(System.out::println);
                break;
        }
    }

    public void sumar(){
        IOperacion operacion =(double x, double y)->(x+y);
        double resultado = operacion.calcular(2,2.0);
        System.out.println(resultado);
    }


    public static void main(String[] args) {
        App app= new App();
       //app.probar("IMPAR");
       //app.sumar();

       
    }
}

