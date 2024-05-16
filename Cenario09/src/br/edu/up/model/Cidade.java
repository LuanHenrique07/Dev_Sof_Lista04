package br.edu.up.model;

public class Cidade {
    private String Nome;
    private String UF;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

    @Override
    public String toString() {
        return "Cidade [Nome = " + Nome + ", UF = " + UF + "]";
    }

}
