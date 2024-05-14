package br.edu.up.model;

public class Professor extends Pessoa {

    private String LattesId;
    private String Titulacao;

    public Professor(String Nome, String Rg, String Matricula, String LattesId, String Titulacao) {
        this.LattesId = LattesId;
        this.Titulacao = Titulacao;
    }

    public String getLattesId() {
        return LattesId;
    }

    public void setLattesId(String lattesId) {
        LattesId = lattesId;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String titulacao) {
        Titulacao = titulacao;
    }

}
