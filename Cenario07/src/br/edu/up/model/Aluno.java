package br.edu.up.model;

public class Aluno extends Pessoa {

    private int AnoIngresso;
    private String NomeCurso;
    private String Turno;

    public Aluno(String Nome, String Rg, String Matricula, int anoIngresso, String nomeCurso, String turno) {
        AnoIngresso = anoIngresso;
        NomeCurso = nomeCurso;
        Turno = turno;
    }

    public int getAnoIngresso() {
        return AnoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        AnoIngresso = anoIngresso;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }
}
