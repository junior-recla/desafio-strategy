package com.company;

public class Pessoa {

    private final String nome;
    private Lingua lingua;

    Pessoa(String nome, Lingua lingua){
        this.nome = nome;
        this.lingua = lingua;
    }

    public String getNome() {
        return nome;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }

    public void falar(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome).append(" diz: ");

        System.out.print(sb.toString());
        this.lingua.falarLingua();
    }
}
