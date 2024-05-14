package br.edu.up;

public class ClienteEmpresa {
    private String Cnpj;
    private String InscEstadual;
    private int AnoFundacao;

    public ClienteEmpresa(double credito) {

    }

    public double getSaldo() {
        return AnoFundacao;
    }

    public String getDados() {
        return "Altura";
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getInscEstadual() {
        return InscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        InscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return AnoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        AnoFundacao = anoFundacao;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa [Cnpj=" + Cnpj + ", InscEstadual=" + InscEstadual + ", AnoFundacao=" + AnoFundacao + "]";
    }

}
