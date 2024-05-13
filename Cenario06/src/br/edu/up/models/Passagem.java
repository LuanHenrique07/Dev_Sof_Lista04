package br.edu.up.models;

public class Passagem {
    private int numeroAssento;
    private String classeAssento;

    public Passagem(int numeroAssento, String classeAssento) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }
    
}