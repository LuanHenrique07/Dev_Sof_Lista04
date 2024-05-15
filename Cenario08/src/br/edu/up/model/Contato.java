package br.edu.up.model;

public abstract class Contato {

    private int Codigo;
    private String Nome;
    private String Telefone;

    public Contato(int codigo, String nome, String telefone) {
        Codigo = codigo;
        Nome = nome;
        Telefone = telefone;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato [Codigo = " + Codigo + ", Nome = " + Nome + ", Telefone = " + Telefone + "]";
    }

}
