package model;

public class Reserva {
    private Evento evento;
    private String Responsavel;
    private int QuantidadePessoa;
    private String DataReserva;
    private double ValorTotal;

    public Reserva(Evento evento, String Responsavel, int QuantidadePessoa, String DataReserva, double ValorTotal) {
        this.evento = evento;
        this.Responsavel = Responsavel;
        this.QuantidadePessoa = QuantidadePessoa;
        this.DataReserva = DataReserva;
        this.ValorTotal = ValorTotal;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String responsavel) {
        Responsavel = responsavel;
    }

    public int getQuantidadePessoa() {
        return QuantidadePessoa;
    }

    public void setQuantidadePessoa(int quantidadePessoa) {
        QuantidadePessoa = quantidadePessoa;
    }

    public String getDataReserva() {
        return DataReserva;
    }

    public void setDataReserva(String dataReserva) {
        DataReserva = dataReserva;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

}   
