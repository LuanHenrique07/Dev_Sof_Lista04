package br.edu.up.model;

public class Comercial extends Contato {

    private String Cnpj;

    public Comercial(int codigo, String nome, String telefone, String cnpj) {
        super(codigo, nome, telefone);
        Cnpj = cnpj;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
