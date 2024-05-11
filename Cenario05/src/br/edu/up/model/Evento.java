package br.edu.up.model;

public class Evento {

    protected String Nome;
    protected String Data;
    protected String Local;
    protected int LotacaoMaxima;
    protected int IngressoVendido;
    protected double PrecoIngresso;

    public Evento(String Nome, String Data, String Local, int LotacaoMaxima, int IngressoVendido, double PrecoIngresso) {
        this.Nome = Nome;
        this.Data = Data;
        this.Local = Local;
        this.LotacaoMaxima = LotacaoMaxima;
        this.IngressoVendido = IngressoVendido;
        this.PrecoIngresso = PrecoIngresso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public int getLotacaoMaxima() {
        return LotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        LotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressoVendido() {
        return IngressoVendido;
    }

    public void setIngressoVendido(int ingressoVendido) {
        IngressoVendido = ingressoVendido;
    }

    public double getPrecoIngresso() {
        return PrecoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        PrecoIngresso = precoIngresso;
    }

}
