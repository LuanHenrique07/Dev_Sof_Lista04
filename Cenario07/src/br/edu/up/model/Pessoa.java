package br.edu.up.model;

public class Pessoa {
    private String Nome;
    private String Rg;
    private String Matricula;

    public Pessoa(String nome, String rg, String matricula) {
        this.Nome = nome;
        this.Rg = rg;
        this.Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        this.Rg = rg;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }
}
