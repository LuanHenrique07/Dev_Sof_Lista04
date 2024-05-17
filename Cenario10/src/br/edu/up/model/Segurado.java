package br.edu.up.model;

public class Segurado {
    private String Nome;
    private String Rg;
    private String Cpf;
    private String Telefone;
    private String Endereco;
    private String Cep;
    private String Cidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "Segurado [Nome = " + Nome + ", Rg = " + Rg + ", Cpf = " + Cpf + ", Telefone = " + Telefone
                + ", Endereco = "
                + Endereco + ", Cep = " + Cep + ", Cidade = " + Cidade + "]";
    }
}
