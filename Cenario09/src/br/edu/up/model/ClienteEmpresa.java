package br.edu.up.model;

public class ClienteEmpresa extends Cliente {
    private String Cnpj;
    private String InscEstadual;
    private int AnoFundacao;

    public ClienteEmpresa() {
        super(25000.0);
    }

    @Override
    public double emprestar(double valor) {
        if (getVlrEmprestado() + valor <= getVlrMaxCredito()) {
            setVlrEmprestado(getVlrEmprestado() + valor);
            return getVlrEmprestado();
        } else {
            return -1;
        }
    }

    @Override
    public double devolver(double valor) {
        if (getVlrEmprestado() - valor >= 0) {
            setVlrEmprestado(getVlrEmprestado() - valor);
            return getVlrEmprestado();
        } else {
            return -1; 
        }
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getInscEstadual() {
        return InscEstadual;
    }

    public void setInscEstadual(String InscEstadual) {
        this.InscEstadual = InscEstadual;
    }

    public int getAnoFundacao() {
        return AnoFundacao;
    }

    public void setAnoFundacao(int AnoFundacao) {
        this.AnoFundacao = AnoFundacao;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [nome = " + getNome() + ", telefone = " + getTelefone() + ", email = " + getEmail() +
               ", Cnpj = " + Cnpj + ", InscEstadual = " + InscEstadual + ", AnoFundacao = " + AnoFundacao + 
               ", saldo = " + getSaldo() + "]";
    }
}
