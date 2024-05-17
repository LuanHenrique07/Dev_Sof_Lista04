package br.edu.up.model;

public class Professor extends Pessoa {
    private String LattesId;
    private String Titulacao;

    public Professor(String nome, String rg, String matricula, String lattesId, String titulacao) {
        super(nome, rg, matricula);
        this.LattesId = lattesId;
        this.Titulacao = titulacao;
    }

    public String getLattesId() {
        return LattesId;
    }

    public void setLattesId(String lattesId) {
        this.LattesId = lattesId;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.Titulacao = titulacao;
    }
}
