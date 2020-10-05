package com.company;

public class Pessoa {

    final String nome;
    Lingua lingua;

    Pessoa(String nome, Lingua lingua){
        this.nome = nome;
        this.lingua = lingua;
    }

    public String getNome() {
        return nome;
    }

    public Lingua getLingua() {
        return lingua;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }
}
