package com.exemplo.pacote;

public class Animal {
    private String nome;

    protected void fazerSom() {
        System.out.println("Som de animal");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}