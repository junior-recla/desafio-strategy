package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*//Instanciando usando lambda e classe anônima.
        Pessoa carlos = new Pessoa("Carlos", () -> System.out.println("Estou falando Português!") );
        Pessoa eduardo = new Pessoa("Eduardo", () -> System.out.println("Parlo italiano!"));
        Pessoa camila = new Pessoa("Camila", () -> System.out.println("I am speaking English!"));
        Pessoa gabriel = new Pessoa("Gabriel", () -> System.out.println("Estoy hablando español!"));
        Pessoa outro = new Pessoa("Outro", () -> System.out.println("Estou falando outra lingua quaquer!"));
        List<Pessoa> pessoas = Arrays.asList(carlos, eduardo, camila, gabriel, outro);
        //*/

        //*//
        Pessoa carlos = new Pessoa("Carlos", new LinguaPortugues());
        Pessoa eduardo = new Pessoa("Eduardo", new LinguaItaliano());
        Pessoa camila = new Pessoa("Camila", new LinguaIngles());
        Pessoa gabriel = new Pessoa("Gabriel", new LinguaEspanhol());
        List<Pessoa> pessoas = Arrays.asList(carlos, eduardo, camila, gabriel);
        //*/

        pessoas.forEach( Pessoa::falar );

    }
}
