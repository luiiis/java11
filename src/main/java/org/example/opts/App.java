package org.example.opts;

import org.example.lambdas.Archivo;

import java.util.Optional;

public class App {
    //jdk 11
    public void estavacio(Persona per){
        //Optional <Persona> op = Optional.empty();
        Optional<Persona> op = Optional.ofNullable(per);
        if(op.isEmpty()){
            System.out.println("[11] esta vacio");
        }else{ System.out.println("[11] esta lleno"+op.get());}
    }
    //jdk 8
    public void estaPresente(Persona per){
        //Optional <Persona> op = Optional.empty();
        Optional<Persona> op = Optional.ofNullable(per);
        if(!op.isPresent()){
            System.out.println("[8] esta vacio");
        }else {
            System.out.println("[8] esta lleno" + op.get());
        }
    }

    public static void main(String[] args) {
      App app = new App();
      //Persona per = new Persona(1,"Mito code");
        //Persona per = new Persona();
      //app.estavacio(per);
      //app.estaPresente(per);

    }
}
