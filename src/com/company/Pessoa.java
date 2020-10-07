package com.company;

public class Pessoa {

    private final String nome;
    private Lingua lingua;
    private final StringBuilder sbFalar = new StringBuilder();

    Pessoa(String nome, Lingua lingua){
        this.nome = nome;
        this.lingua = lingua;
        sbFalar.append(nome).append(" diz: ");
    }

    public String getNome() {
        return nome;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }

    public void falar(){
        System.out.print(sbFalar.toString());
        this.lingua.falarLingua();
    }
}
