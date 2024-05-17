package br.edu.up.model;

public class Aluno extends Pessoa {
    private int AnoIngresso;
    private String NomeCurso;
    private String Turno;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String nomeCurso, String turno) {
        super(nome, rg, matricula);
        this.AnoIngresso = anoIngresso;
        this.NomeCurso = nomeCurso;
        this.Turno = turno;
    }

    public int getAnoIngresso() {
        return AnoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.AnoIngresso = anoIngresso;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.NomeCurso = nomeCurso;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        this.Turno = turno;
    }
}
