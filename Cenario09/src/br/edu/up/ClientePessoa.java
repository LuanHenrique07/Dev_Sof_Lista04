package br.edu.up;

public class ClientePessoa {
    private String Cpf;
    private double Peso;
    private double Altura;

    public ClientePessoa(double credito) {
        // CPF = cPF;
        // Peso = peso;
        // Altura = altura;
    }

    public double getSaldo() {
        return Altura;
    }

    public String getDados() {
        return "Altura";
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    @Override
    public String toString() {
        return "ClientePessoa [CPF=" + Cpf + ", Peso=" + Peso + ", Altura=" + Altura + "]";
    }

}
